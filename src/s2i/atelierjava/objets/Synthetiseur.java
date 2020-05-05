/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.objets;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author quico
 */
public class Synthetiseur{
    
    private BoutonOnOff boutonPower;
    private BoutonSelecteur selecteurInstrument;
    private BoutonSelecteur selecteurVol;

    public Synthetiseur() {
        this.boutonPower = new BoutonOnOff();
        this.selecteurInstrument = new BoutonSelecteur(12);
        this.selecteurVol = new BoutonSelecteur(10);
    }

    /**
     * Polymorphisme des fonctions ( autre fonction porte meme nom mais params différents ; )
     * @param notes 
     */
    public void playNote(String notes) throws MidiUnavailableException{
        
        String[] tabNotes = notes.split(" ");
        for (String note : tabNotes) {
            int noteInt = Integer.parseInt(note);
            this.playNote(noteInt);
        }
    }
    
    public void playNote(int note) throws MidiUnavailableException{
        
        // Quitte si synthé pas allumé
        if( this.boutonPower.isOn()==false ){
            return;
        }
        
        // Le bouton power était à on
        
        Synthesizer midiSynth = MidiSystem.getSynthesizer(); 
        midiSynth.open();

        //get and load default instrument and channel lists
        Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
        MidiChannel[] mChannels = midiSynth.getChannels();

        midiSynth.loadInstrument(instr[0]);//load an instrument

        mChannels[0].noteOn(note, this.selecteurVol.getValeur()*10);//On channel 0, play note number 60 with velocity 100 
        try { Thread.sleep(1000); // wait time in milliseconds to control duration
        } catch( InterruptedException e ) { }
        mChannels[0].noteOff(60);//turn of the note
    }
    
    public int getInstrument(){
        return this.selecteurInstrument.getValeur();
    }
    
    public int getVol(){
        return this.selecteurVol.getValeur();
    }
    
    public boolean volDown(){
        return this.selecteurVol.diminuer();
    }
    
    public boolean  volUp(){
        return this.selecteurVol.augmenter();
    }
    
    public boolean instrDown(){
        return this.selecteurInstrument.diminuer();
    }
    
    public boolean instrUp(){
        return this.selecteurInstrument.augmenter();
    }
    
    public boolean power(){
        this.boutonPower.appuiBouton();
        
        return this.boutonPower.isOn();
    }
}
