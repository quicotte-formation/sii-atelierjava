/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.objets;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import s2i.atelierjava.objets.BoutonOnOff;

/**
 *
 * @author quico
 */
public class BoutonOnOffTest {
    
    @Test
    public void test(){
        BoutonOnOff b = new BoutonOnOff();
        b.appuiBouton();
        assertTrue( b.isOn() );
        b.appuiBouton();
        assertFalse( b.isOn() );
    }
}
