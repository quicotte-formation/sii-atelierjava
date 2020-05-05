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
public class Autruche extends Oiseau{

    @Override
    public void avancer() {
        super.avancer();// Avance comme son parent
        this.y = 0;
    }
    
    
}
