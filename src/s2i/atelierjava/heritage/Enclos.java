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
public class Enclos {
    
    protected ArrayList<Animal> animaux = new ArrayList<>();

    public Enclos() {
    }

    
    
    public Enclos(int nbAnimaux, String typeAnimal){
        this.addAnimaux(nbAnimaux, typeAnimal);
    }
    
    public void addAnimal(Animal a){
        this.animaux.add(a);
    }
    
    public void addAnimaux(int nbAnimaux, String typeAnimal){
        
        for(int i=0;i<nbAnimaux;i++){
            Animal a=null;
            switch(typeAnimal){
                case "Reptile":
                    a = new Reptile();
                    break;
                case "Autruche":
                    a = new Autruche();
                    break;
                default:
                    break;
            }
            
            this.animaux.add(a);
        }
    }
}
