package entities;

import metier.IPersonne;

import java.util.Scanner;

public class Etudiant extends Personne implements IPersonne {
    private String matricule;
    private double moyenne;

    public Etudiant() {

    }

    public Etudiant(String nom, String prenom, String matricule, double moyenne) {
        super(nom, prenom);
        this.matricule = matricule;
        this.moyenne = moyenne;
        matricule = generateMatricule();
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
    private String generateMatricule(){

        String mat;
        mat = "Et-"+prenom.charAt(0)+((nom.length()<3)?"#":nom.charAt(2))+prenom.length();
        return mat;
    }

    public void saisie() {
        saisieP();
        matricule = generateMatricule();
        do {
            System.out.println("Veuillez saisir la moyenne");
            Scanner scan = new Scanner(System.in);
            moyenne = scan.nextDouble();
        }while (moyenne<0 || moyenne>20);
    }

    public void affiche() {
        System.out.println("Nom : "+nom);
        System.out.println("Prénom : "+prenom);
        System.out.println("Matricule : "+matricule);
        System.out.println("Moyenne : "+moyenne);
    }
}