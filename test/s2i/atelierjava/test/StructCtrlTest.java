/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author quico
 */
public class StructCtrlTest {

    @Test
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

    @Test
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

    @Test
    public void verifie1PlusPetitQue2Et2PlusPetitQue3OK() {

        int a = 1, b = 2, c = 3;

        if (!(a < b && b < c)) {
            fail("Erreur perso");
        }
    }

    @Test
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
