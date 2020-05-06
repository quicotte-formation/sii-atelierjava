/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.interfaces;

/**
 *
 * @author quico
 */
public class Terrain implements Additionnable{
    private int largeur;
    private int longueur;

    public Terrain(int largeur, int longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    
    
    @Override
    public void ajoute(Object obj2) {
        Terrain terrain2 = (Terrain)obj2;
        
        this.largeur += terrain2.largeur;
        this.longueur += terrain2.longueur;
    }
}
