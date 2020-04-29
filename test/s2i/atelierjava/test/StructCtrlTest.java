/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author quico
 */
public class StructCtrlTest {

    @Test
    public void whileSommeDeUnADixEgal55OK(){
        
        int somme = 0;
        int i = 1;
        while(i<11){
            somme += i;// Equivalent à somme = somme +i;
            i++;// Ou i+=1
        }
        assertEquals(somme, 55);
    }
    
    
//    @Test
    public void tablesDeMultiplicationsDe2De3De4JusqueDe10(){
        // SI on a besoin de tableaux flexibles, utiliser l'interpréteur Jython dans Java.
//        int[][] tab = new int[10][10];
//        tab[0][0]=123;
//        ArrayList< ArrayList<Integer> > tables = new ArrayList<>();
//        ArrayList<Integer> tableDe2 = new ArrayList();
//        tableDe2.add(2);
//        tableDe2.add(4);
//        tables.add(tableDe2);
        
        for(int i=2;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.print( i*j + " " );
            }
            System.out.println();
        }
    }
    
//    @Test
    public void factorielle8Egal40320OK(){
        
        int res=8;
        for(int i=7;i>1;i--){
            res = res * i;
        }
        assertEquals(res, 40320);
    }
    
//    @Test
    public void forTableMul3OK(){
        
        for( int i=1; i<11; i++ ){
            System.out.println( 3 * i );
        }
    }
    
//    @Test
    public void forOK(){
        
        for( int i=10 ; i<21 ; i++ ){
            
            System.out.println(i);
        }
    }
    
//    @Test
    public void forEachOK(){
        
        ArrayList<String> pays = new ArrayList<>();
        pays.add("espagne");
        pays.add("italie");
        pays.add("portugal");
        
        for( String paysAct : pays ){
            
            System.out.println( paysAct );
        }
    }
    
//    @Test
    public void verifieChoixUtilAvecSwitch() {

        int a = 10, b = 2;
        
        System.out.println("Menu");
        System.out.println("****");
        System.out.println("****");// A=+, B=-, C=/, D=*
        System.out.println("A Addition");
        System.out.println("B Soustraction");
        System.out.println("C Division");
        System.out.println("D Multiplication");
        String choix = "C";// En vrai on aurait une entrée clavier ; )
        int res;
        switch (choix) {
            case "A":
                res = a + b;
                assertEquals(res, 12);
                break;
            case "B":
                res = a - b;
                assertEquals(res, 8);
                break;
            case "C":
                res = a / b;
                assertEquals(res, 5);
                break;
            case "D":
                res = a * b;
                assertEquals(res, 20);
                break;
            default:
                fail("Opération non prévue");
                break;
        }
    }

//    @Test
    public void verifieChoixUtilAvecIfElse() {

        int a = 10, b = 2;

        System.out.println("Menu");
        System.out.println("****");
        System.out.println("****");// A=+, B=-, C=/, D=*
        System.out.println("A Addition");
        System.out.println("B Soustraction");
        System.out.println("C Division");
        System.out.println("D Multiplication");
        String choix = "C";// En vrai on aurait une entrée clavier ; )
        int res;
        if (choix == "C") {
            res = a + b;
            assertEquals(res, 12);
        } else if (choix == "B") {
            res = a - b;
            assertEquals(res, 8);
        } else if (choix == "C") {
            res = a / b;
            assertEquals(res, 5);
        } else if (choix == "D") {
            res = a * b;
            assertEquals(res, 20);
        } else {
            fail("Opération non prévue");
        }
    }

//    @Test
    public void verifie1PlusPetitQue2Et2PlusPetitQue3OK() {

        int a = 1, b = 2, c = 3;

        if (!(a < b && b < c)) {
            fail("Erreur perso");
        }
    }

//    @Test
    public void ifElseOK() {

        int a = 10, b = 20, c = 30;
        if (a == b && b == c) {
            //CODE CORRESPONDANT si test est vrai
        } else if (a < 10) {
            //CODE Si test faux
        } else {
            // Si ts tests précédents sont faux
        }
    }
}
