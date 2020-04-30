/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.objets;

import org.testng.annotations.Test;
import s2i.atelierjava.objets.Gateau;

/**
 *
 * @author quico
 */
public class GateauTest {
    
    @Test
    public void preparer2GateauxOK(){
        
        Gateau gateau1 = new Gateau("Maïs", 80, 15, 5);// Mais, 80farine, 15beure, 5 sucre
        Gateau gateau2 = new Gateau("Epautre", 60, 30, 10);// Epautre, 60, 30, 10
       
        System.out.println("Type de farine:" + gateau2.getTypeFarine());
        
        gateau1.setProportionBeure(20);
        gateau1.setProportionFarine(80);
        gateau1.setProportionSucre(10);
        
        gateau1.preparer();
        gateau2.preparer();
    }
}
