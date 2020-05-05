/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.heritage;

import java.util.ArrayList;

/**
 *
 * @author quico
 */
public class Zoo {
    
    protected ArrayList<Enclos> mesEnclos;

    public Zoo() {
        this.mesEnclos = new ArrayList<>();
        
        // Ajoute au zoo un enclos avec 10 reptiles
        Enclos enclosReptiles = new Enclos();
        for(int i = 0;i<10; i++){
            enclosReptiles.addAnimal(new Reptile());
        }
        this.mesEnclos.add(enclosReptiles);
        
        // Enclos autruches
        this.mesEnclos.add( new Enclos(20, "Autruche") );
        
        // Enclos mixte
        Enclos enclosToucansFlamands = new Enclos(2, "Toucan");
        enclosToucansFlamands.addAnimaux(2, "Flamand");
        this.mesEnclos.add(enclosToucansFlamands);
    }
}
