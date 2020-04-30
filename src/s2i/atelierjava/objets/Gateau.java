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

    public Gateau(String typeFarine, int propFarine, int propBeure, int propSucre ){
        this.typeFarine=typeFarine;
        this.proportionSucre=propSucre;
        this.proportionFarine=propFarine;
        this.proportionBeure=propBeure;
    }
    
    public Gateau(){
        System.out.println("CONSTRUCTEUR Gateau()");
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
    
    
    
    public String getTypeFarine(){
        return this.typeFarine;
    }
    
    public void setProportionSucre(int proportionSucre) {
        this.proportionSucre = proportionSucre;
    }

    public void setProportionBeure(int proportionBeure) {
        this.proportionBeure = proportionBeure;
    }
    
    public void setProportionFarine(int proportion){
        this.proportionFarine=proportion;
    }
    
    public void setTypeFarine(String typeFarine){
        this.typeFarine = typeFarine;
    }
    
    /**
     * Affiche "Recette: 80 pct de farine de sarazin, 15 pct de beure, 5 pct de sucre
     */
    public void preparer(){
        String txt = String.format( "Recette: %d pct de farine de %s, %d pct de beure, %d pct de sucre", 
                this.proportionFarine, 
                this.typeFarine, 
                this.proportionBeure, 
                this.proportionSucre);
        System.out.println( txt );
    }
}
