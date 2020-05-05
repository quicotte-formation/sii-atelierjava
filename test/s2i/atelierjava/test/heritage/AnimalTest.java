/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.heritage;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import s2i.atelierjava.heritage.Animal;
import s2i.atelierjava.heritage.FlamandRose;
import s2i.atelierjava.heritage.Oiseau;

/**
 *
 * @author quico
 */
public class AnimalTest {
    
    @Test
    public void genericite(){
        Animal a = new FlamandRose();// = GéNERICITé
        a.avancer();
        System.out.println( a.toString() );
        
        //
        
        ArrayList<Animal> animaux = new ArrayList<>();
        animaux.add(new FlamandRose());
    }
    
//    @Test
    public void testAvanceOiseau(){
        Oiseau o = new Oiseau();
        o.avancer();
        System.out.println( o.toString() );
    }
}
