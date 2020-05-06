/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.heritage;

import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.Test;
import s2i.atelierjava.heritage.Animal;
import s2i.atelierjava.heritage.Autruche;
import s2i.atelierjava.heritage.FlamandRose;
import s2i.atelierjava.heritage.Insecte;
import s2i.atelierjava.heritage.Mammifere;
import s2i.atelierjava.heritage.Oiseau;
import s2i.atelierjava.heritage.Poisson;
import s2i.atelierjava.heritage.Reptile;

/**
 *
 * @author quico
 */
public class AnimalTest {
    
//    @Test
    public void verifieAutrucheNoVollePasQuandElleAvance(){
        Autruche a = new Autruche();
        a.avancer();
        Assert.assertEquals( a.getY(), 0 );
    }
    
    @Test
    public void testListeGenerique(){
        
        ArrayList<Animal> animaux = new ArrayList<>();
        animaux.add( new Oiseau() );
        animaux.add( new Poisson() );
        animaux.add( new Insecte() );
        animaux.add( new Mammifere() );
        animaux.add( new Reptile() );
        
        for(Animal a : animaux){
            a.avancer();
        }
        
        System.out.println( animaux );
    }
    
//    @Test
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
