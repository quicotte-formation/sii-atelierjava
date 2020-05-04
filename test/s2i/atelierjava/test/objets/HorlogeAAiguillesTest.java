/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.objets;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import s2i.atelierjava.objets.HorlogeAAiguilles;

/**
 *
 * @author quico
 */
public class HorlogeAAiguillesTest {
    
    @Test
    public void test(){
        HorlogeAAiguilles h = new HorlogeAAiguilles(2, 59);
        h.avancerUneMinute();
        String time = h.toString();
        assertEquals(time, "03:00");
        
        HorlogeAAiguilles h2 = new HorlogeAAiguilles(10, 5);
        assertEquals(h2.toString(), "10:05");
        h2.avancerUneMinute();
        assertEquals(h2.toString(), "10:06");
    }
}
