/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.langage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import s2i.atelierjava.heritage.Poisson;

/**
 *
 * @author quico
 */
public class StringTest {
    
    @Test
    public void testToString(){
        Poisson p = new Poisson();
        System.out.println( p );
    }
    
//    @Test
    public void splitDateOK(){
        Pattern p = Pattern.compile("([0-9]{1,2})/([0-9]{1,2})/([0-9]{4})");
        Matcher m = p.matcher("30/4/2020");
        m.find();
        assertEquals( m.group(1) , "30");
        assertEquals( m.group(2) , "4");
        assertEquals( m.group(3) , "2020");
    }
    
//    @Test
    public void regexSplitOK(){
        Pattern p = Pattern.compile("([\\p{Alnum}]{2,}@)([a-zA-Z0-9_-]{2,}.[a-z]{2,})");
        Matcher m = p.matcher("quicotte@gmail.com");
        m.find();
        for(int i=0;i<=m.groupCount();i++){
            System.out.println( i + " " + m.group(i) );
        }
    }
    
//    @Test
    public void regexMatchesOK(){
        
        // Check date validity ( sans années bisextiles, jour<30/31, ... )
        assertTrue( "30/4/2020".matches("[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}") );

        // Check email ok : \\p{Alnum} = Alpha-numérique, Apha et Digit
        assertTrue( "quicotte@gmail.com".matches("[\\p{Alnum}]{2,}@[a-zA-Z0-9_-]{2,}.[a-z]{2,}") );

        // Check format tel ok
        String tel = "0665831322";
        String regex="[0][1-8][0-9]{8}";
        assertTrue( tel.matches(regex) );
    }
    
//    @Test
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
