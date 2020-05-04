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
public class Gateau {

    private String typeFarine;
    private int proportionSucre;
    private int proportionFarine;
    private int proportionBeure;

    public Gateau(String typeFarine, int propFarine, int propBeure, int propSucre) {
        this.typeFarine = typeFarine;
        this.setProportionBeure(propBeure);
        this.setProportionFarine(propFarine);
        this.setProportionSucre(propSucre);
    }

    public void mangerLaMoitie(){
        this.proportionBeure /= 2;// Equivalent à = this.propBeure / 2 ; )
        this.proportionFarine /= 2;
        this.proportionSucre /= 2;
    }
    
    public int getProportionSucre() {
        return proportionSucre;
    }

    public int getProportionFarine() {
        return proportionFarine;
    }

    public int getProportionBeure() {
        return proportionBeure;
    }

    public String getTypeFarine() {
        return this.typeFarine;
    }

    public void setProportionSucre(int proportionSucre) {
        if (proportionSucre + this.proportionFarine + this.proportionBeure > 100) {
            this.proportionSucre = 100 - this.proportionBeure - this.proportionFarine;
        } else {
            this.proportionSucre = proportionSucre;
        }
    }

    public void setProportionBeure(int proportionBeure) {
        if (this.proportionSucre + this.proportionFarine + proportionBeure > 100) {
            this.proportionBeure = 100 - this.proportionSucre - this.proportionFarine;
        } else {
            this.proportionBeure = proportionBeure;
        }
    }

    public void setProportionFarine(int proportionFarine) {
        if (this.proportionSucre + proportionFarine + this.proportionBeure > 100) {
            this.proportionFarine = 100 - this.proportionSucre - this.proportionBeure;
        } else {
            this.proportionFarine = proportionFarine;
        }
    }

    public void setTypeFarine(String typeFarine) {
        this.typeFarine = typeFarine;
    }

    /**
     * Affiche "Recette: 80 pct de farine de sarazin, 15 pct de beure, 5 pct de
     * sucre
     */
    public void afficher() {
        String txt = String.format("Recette: %d pct de farine de %s, %d pct de beure, %d pct de sucre",
                this.proportionFarine,
                this.typeFarine,
                this.proportionBeure,
                this.proportionSucre);
        System.out.println(txt);
    }
}
