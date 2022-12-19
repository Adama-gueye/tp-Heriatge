package entities;

import metier.IPersonne;

import java.util.Scanner;

public class Employe extends Personne implements IPersonne {
    public String fonction;

    public Employe() {
    }

    public Employe(String nom, String prenom, String fonction, int salaire) {
        super(nom, prenom);
        this.fonction = fonction;
        this.salaire = salaire;
    }


    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public int salaire;


    public void saisie() {

    }

    public void affiche() {
        System.out.println("Nom : "+nom);
        System.out.println("Prénom : "+prenom);
        System.out.println("Fonction : "+fonction);
        System.out.println("Salaire : "+salaire);
    }
}
