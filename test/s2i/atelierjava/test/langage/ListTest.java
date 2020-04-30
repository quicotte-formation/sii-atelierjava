/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.langage;

import static org.testng.Assert.*;
import java.util.ArrayList;
import org.testng.annotations.Test;

/**
 *
 * @author quico
 */
public class ListTest {
    
    @Test
    public void removeAllFranceDeFranceGuadeloupeMartiniqueFranceOK(){
        
        ArrayList<String> countries = new ArrayList<>();
        countries.add("France");
        countries.add("Guadeloupe");
        countries.add("Martinique");
        countries.add("France");
        
        assertEquals( countries.get(1), "Guadeloupe" );
        
        ArrayList<String> listeARemove = new ArrayList<>();
        listeARemove.add("France");
        listeARemove.add("Martinique");
        
        System.out.println( countries );
        countries.removeAll(listeARemove);
        System.out.println( countries );
        System.out.println( listeARemove );
        
        System.out.println( countries.size() );
        
        countries.removeAll(countries);
        countries.addAll(countries);
        
        if( countries.contains("USA")==true ){
            System.out.println("USA présent");
        }
        
        for(String paysAct : countries){
            System.out.println(paysAct);
        }
    }
    
//    @Test
    public void test1(){
        
        ArrayList<String> pays = new ArrayList<>();
        pays.add("espagne");
        pays.add("angleterre");
        pays.add(1, "france");
        
        ArrayList<String> autresPays = new ArrayList<>();
        autresPays.add("usa");
        autresPays.add("jamaïque");
        
        pays.addAll(1, autresPays);
        pays.add("france");
        
        System.out.println( pays );
    }
}
