/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.objets;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import s2i.atelierjava.objets.Aiguille;
import s2i.atelierjava.objets.HorlogeAAiguilles;

/**
 *
 * @author quico
 */
public class AiguilleTest {
    
    @Test
    public void test(){
        
        Aiguille a = new Aiguille(30, 180);
        a.avance();
        assertEquals( a.getPosition(), 31);
        
        a.setPosition(179);
        a.avance();
        assertEquals( a.getPosition() , 0);
        
        new HorlogeAAiguilles(11, 59);
    }
}
