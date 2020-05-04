/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.objets;

/**
 *
 * @author quico
 */
public class HorlogeAAiguilles {
    
    private Aiguille aiguilleDesHeures;
    private Aiguille aiguilleDesMinutes;

    public HorlogeAAiguilles(int heure, int min) {
        
        this.aiguilleDesMinutes = new Aiguille(min, 60);
        this.aiguilleDesHeures = new Aiguille(heure, 12);
    }
    
    public void avancerUneMinute(){
        this.aiguilleDesMinutes.avance();
        if( this.aiguilleDesMinutes.getPosition()==0 ){
            this.aiguilleDesHeures.avance();
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.aiguilleDesHeures.getPosition(), this.aiguilleDesMinutes.getPosition());
    }
    
    
}
