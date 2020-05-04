/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.objets;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Ajouter ds classe personne champs nom, prenom, dateNaissance (LocalDate)
 * Override la fonction toString qui affichera le tout, puis 1 test,
 * dans lequel on aura 1 fonction qui crée un util et vérifie que
 * le toString renvoie bien ce qu'on attend.
 * @author quico
 */
public class Personne {
    
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;

    public Personne(String nom, String prenom, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = this.dateNaissance.format(formatter);
        
        String txt = String.format("%s %s : %s", this.prenom, this.nom, date);
        return txt;
    }
    
    
}
