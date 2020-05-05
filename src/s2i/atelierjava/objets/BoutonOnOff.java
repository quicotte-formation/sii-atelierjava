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
public class BoutonOnOff {
    
    private boolean on = false;

    public boolean isOn() {
        return on;
    }
    
    public void appuiBouton(){
        if(this.on==false){
            this.on=true;
        }else{
            this.on=false;
        }
        // ou remplater le tout par this.on=!this.on
    }
}
