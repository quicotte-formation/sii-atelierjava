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
public class Horloge/* IMPLICITEMENT : extends Object */{
    
    private int heure, min, sec;

    public Horloge(int heure, int min, int sec) {
        this.heure = heure;
        this.min = min;
        this.sec = sec;
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.heure, this.min, this.sec);
    }
    
    public void avancerUneSeconde(){
        this.sec++;
        if( this.sec>=60 ){
            this.sec=0;
            this.min++;
            if( this.min>=60 ){
                this.min=0;
                this.heure++;
                if( this.heure>=24 ){
                    this.heure=0;
                }
            }
        }
    }
}
