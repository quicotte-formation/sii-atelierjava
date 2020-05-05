/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.objets;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import s2i.atelierjava.objets.BoutonSelecteur;

/**
 *
 * @author quico
 */
public class BoutonSelecteurTest {
    
    @Test
    public void test(){
        BoutonSelecteur bouton1 = new BoutonSelecteur(10);
        bouton1.augmenter();
        bouton1.augmenter();
        assertEquals(bouton1.getValeur(), 2);
        
        for(int i=0;i<1000;i++){
            bouton1.augmenter();
        }
        assertEquals(bouton1.getValeur(), 10);
        
        bouton1 = new BoutonSelecteur(10);
        bouton1.diminuer();
        assertEquals(bouton1.getValeur(), 0);
    }
}
