/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test;

import com.sun.tools.javac.util.StringUtils;
import java.util.Arrays;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author quico
 */
public class StringTest {
    
    @Test
    public void regexOK(){
        String prenomNom = "thomas digna";
        String regex = "[a-z]*";//[0][1-8][[:alnum:]]{8} : téléphone
        
        //String tel = "0665831322";
    }
    
    @Test
    public void test1(){
        
        String[] couleurs = "rouge,vert,bleu".split(",");
        assertEquals(couleurs.length, 3);
        
//        List<String> listeCouleurs = Arrays.asList(couleurs);
//        System.out.println( listeCouleurs );

        int a=10;
        float b=20000.1234f;
        String nom="Tom";
        
//        String texte = a + " " + b + " " + nom;
        String texte = String.format("Valeur a:%d , Valeur b:%.2f , Valeur nom:%s", a, b, nom);
        System.out.println(texte);
        
        String txt1 = "PAris";
        String txt2 = "Paris";
        assertTrue( txt1.equalsIgnoreCase(txt2) );
        
        String cmd = "git init";
        assertTrue( cmd.startsWith("git") );
        assertTrue( cmd.endsWith("init") );
        
        assertTrue( "ainsi parlait Zarathustra".contains("lait") );
        assertEquals("ainsi parlait Zarathustra".indexOf("Zara"), 14 );
        
//        String chaine = "ainsi parlait Zarathustra ainsi il nous parlait";
//        boolean termine = false;
//        int nbFound=0;
//        int lastIndex=0;
//        do{
//            lastIndex = chaine.indexOf("ainsi", lastIndex);
//            if(lastIndex==-1){
//                termine=true;
//            }else{
//                nbFound++;
//                lastIndex++;
//            }
//        }while(termine);
//        
//        assertEquals(nbFound, 2);
    }
}
