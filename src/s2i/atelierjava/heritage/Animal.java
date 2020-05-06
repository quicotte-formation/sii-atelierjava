/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.heritage;

/**
 *
 * @author quico
 */
public abstract class Animal extends EtreVivant{
    
    public void affiche(){
        System.out.println("ANIMAL AFFICHE");
    }
    
    abstract public void avancer();

    @Override
    public String toString() {
        return "TOSTRING DE Animal";
    }
    
    
}
