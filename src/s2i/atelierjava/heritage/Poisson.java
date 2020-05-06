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
public class Poisson extends Animal{

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("POISSON AFFICHE");
    }
    
    @Override
    public void avancer() {
        this.z += 5;
        this.y -= 5;
    }

    @Override
    public String toString() {
        return "BLOU BLOU BLOU";
    }
    
    
}
