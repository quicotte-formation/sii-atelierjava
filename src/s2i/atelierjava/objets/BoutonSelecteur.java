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
public class BoutonSelecteur {
    
    private int valeur;
    private int limiteMax;

    public BoutonSelecteur(int limiteMax) {
        this.limiteMax = limiteMax;
    }

    public int getValeur() {
        return valeur;
    }

    public void augmenter(){
        if(this.valeur<this.limiteMax){
            this.valeur++;
        }
    }
    
    public void diminuer(){
        if(this.valeur>=1){
            this.valeur--;
        }
    }       
}
