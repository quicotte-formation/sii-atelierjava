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

    public boolean augmenter(){
        if(this.valeur<this.limiteMax){
            this.valeur++;
            return true;
        }
        
        return false;
    }
    
    public boolean diminuer(){
        if(this.valeur>=1){
            this.valeur--;
            return true;
        }
        // Y PAS EU DE RETURN ; ) => else serait superflu
        return false;
    }       
}
