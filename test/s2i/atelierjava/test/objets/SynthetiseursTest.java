/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.objets;

import javax.sound.midi.MidiUnavailableException;
import org.testng.annotations.Test;
import s2i.atelierjava.objets.Synthetiseur;

/**
 *
 * @author quico
 */
public class SynthetiseursTest {
    
    @Test
    public void test() throws MidiUnavailableException{
        Synthetiseur synth = new Synthetiseur();
        synth.power();
        synth.volUp();synth.volUp();synth.volUp();synth.volUp();synth.volUp();
//        synth.playNote(80);

        synth.playNote("80 82 84");
    }
}
