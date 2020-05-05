/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.objets;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import org.testng.annotations.Test;

/**
 *
 * @author quico
 */
public class MidiTest {
    
    @Test
    public void test() throws MidiUnavailableException{
        
        Synthesizer midiSynth = MidiSystem.getSynthesizer(); 
        midiSynth.open();

        //get and load default instrument and channel lists
        Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
        System.out.println(instr.length);
        MidiChannel[] mChannels = midiSynth.getChannels();

        midiSynth.loadInstrument(instr[0]);//load an instrument

        mChannels[0].noteOn(60, 100);//On channel 0, play note number 60 with velocity 100 
        try { Thread.sleep(1000); // wait time in milliseconds to control duration
        } catch( InterruptedException e ) { }
        mChannels[0].noteOff(60);//turn of the note

    }
}
