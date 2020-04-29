/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author quico
 */
public class VariableTest {

    @BeforeMethod
    public void avantChaqueTest(){
        System.out.println("@BeforeMethod");
    }
    
    @AfterMethod
    public void apresChaqueTest(){
        System.out.println("@AfterMethod");
    }
    
    @BeforeClass
    public static void avantPremierTest(){
        System.out.println("@BeforeTest");
    }
    
    @AfterClass
    public static void apresDernierTest(){
        System.out.println("@AfterTest");
    }
    
    // Créer 1 nouvelle fonction de test: vérifier que => c du string "100" + 50 = 150 (avec assertion)
    @Test
    public void string100PlusInt50Egal150OK(){
        String a = "100";
        int b = 50;
        
        assertEquals(Integer.parseInt(a)+b, 150);
    }
    
    @Test
    public void typeVariablesOK() {
        // Types intiers
        byte b = 127;// -128 à +127
        short s = 1000;// 2 byte
        int a = 2;// 4 bytes
        long l;// 8
        l = 0;
        Byte monByte = 127;

        // Types décimaux
        float f = (float) 12.34;// simple précision
        double d = 12.34;// double précision

        // Booleen
        boolean monBoolean = true;// ou false

        // String
        char c = 'a';// Ancestral : ne s'utilise plus
        String texte = "coucou";

        // Conversion
        String res = monByte.toString();// Conversion type => string
        monByte = Byte.parseByte("100");// Conversion string => byte
        
        
    }

    @Test
    public void conversionOK() {

        String a = "1000";
        String b = "12.34";
        int c = 123;
        double res = (Integer.parseInt(a) + Double.parseDouble(b)) * (Short.parseShort(a) - c);
        assertEquals(res, 887822.18);
    }
}
