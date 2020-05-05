/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.heritage;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import s2i.atelierjava.heritage.Oiseau;

/**
 *
 * @author quico
 */
public class AnimalTest {
    
    @Test
    public void testAvanceOiseau(){
        Oiseau o = new Oiseau();
        o.avancer();
        System.out.println( o.toString() );
    }
}
