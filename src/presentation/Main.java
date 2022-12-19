package presentation;

import entities.Etudiant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Etudiant> liste = new ArrayList<>();
        int nb;
        do {
            System.out.println("Donner le nombre d'etudiants");
            Scanner scan = new Scanner(System.in);
            nb = scan.nextInt();
        }while (nb <= 0);
        System.out.println("Remplissage de la liste");
        for (int i = 0; i < nb; i++) {
           Etudiant et = new Etudiant();
           et.saisie();
           liste.add(et);
        }
        System.out.println("Affichage du contenu de la liste");
        for (int i = 0; i < liste.size(); i++) {
            System.out.println("Etudiant N°"+i);
            liste.get(i).affiche();
        }
       /* System.out.println("Autre Affichage du contenu de la liste");
        for (Etudiant e: liste) {
            e.affiche();
        }*/
    }
}