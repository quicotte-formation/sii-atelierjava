/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.langage;

import java.util.ArrayList;
import static org.testng.Assert.*;
import java.util.HashSet;
import org.testng.annotations.Test;

/**
 *
 * @author quico
 */
public class SetTest {
    
    @Test
    public void ajoutDoublonOK(){
        
        HashSet<String> capitales = new HashSet();
        capitales.add("paris");
        capitales.add("moscou");
        capitales.add("madrid");
        capitales.add("paris");
        capitales.add("lisbonne");
        assertEquals(capitales.size(), 4);
    }
    
    @Test
    public void ajoutConenuListeAvecDoublonsDansSetOK(){
        ArrayList<String> couleurs = new ArrayList<>();
        couleurs.add("green");
        couleurs.add("yellow");
        couleurs.add("green");
        
        HashSet<String> setCouleurs = new HashSet<>();
        setCouleurs.addAll( couleurs );
        System.out.println( setCouleurs );
        assertEquals(setCouleurs.size(), 2);
    }
}
