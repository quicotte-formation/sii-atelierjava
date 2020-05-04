/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.objets;

import org.testng.annotations.Test;
import s2i.atelierjava.objets.Horloge;
import static org.testng.Assert.*;

/**
 *
 * @author quico
 */
public class HorlogeTest {
    
    @Test
    public void horloge2CasOK(){
        {
            Horloge h1 = new Horloge(10, 0, 5);
            h1.avancerUneSeconde();
            String etatHorloge = h1.toString();
            assertEquals(etatHorloge, "10:00:06");
        }
        {
            Horloge h1 = new Horloge(23, 59, 59);
            h1.avancerUneSeconde();
            assertEquals(h1.toString(), "00:00:00");
        }
    }
    
}
