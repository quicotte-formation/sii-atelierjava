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
public class Aiguille {
    
    private int position;
    private int limite;

    public Aiguille(int position, int limite) {
        this.position = position;
        this.limite = limite;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    public void avance(){
        this.position += 1; // OU ++
        if( this.position>=this.limite ){
            this.position=0;
        }
    }

    @Override
    public String toString() {
        return Integer.toString(this.position);
    }

    
    
    
}
