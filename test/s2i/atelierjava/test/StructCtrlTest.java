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
    public void verifieChoixUtil(){
        
        int a = 10, b = 2;
        
        System.out.println("Menu");
        System.out.println("****");
        System.out.println("****");// A=+, B=-, C=/, D=*
        System.out.println("A Addition");
        System.out.println("B Soustraction");
        String choix = "C";// En vrai on aurait une entrée clavier ; )
        
    }
    
    @Test
    public void verifie1PlusPetitQue2Et2PlusPetitQue3OK(){
        
        int a=1, b=2, c=3;
        
        if( !(a<b && b<c) ){
            fail("Erreur perso");
        }
    }
    
    @Test
    public void ifElseOK(){
        
        int a=10, b=20, c=30;
        if( a==b && b==c ){
            //CODE CORRESPONDANT si test est vrai
        }else if(a<10){
            //CODE Si test faux
        }else{
            // Si ts tests précédents sont faux
        }
    }    
}
