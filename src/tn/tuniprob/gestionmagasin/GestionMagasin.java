/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

import java.time.LocalDateTime;

import java.time.LocalDate;

public class GestionMagasin {

    public static void main(String[] args) {
        Produit P1 = new Produit();
        Produit P2 = new Produit(1021, "Lait", "Delice");
        Produit P3 = new Produit(2510, "Yaourt", "Vitalait");
        Produit P4 = new Produit(3250, "Tomate", "Sicam", 1.2f);
        //3
        System.out.println("--------------- Question 3----------------");
        P4.afficher();
        //4
        System.out.println("--------------- Question 4 ----------------");
        P4.setPrix(0.7f);
        P4.afficher();
        //5
        //System.out.println("--------------- Question 5 ----------------");
        P2.setPrix(0.8f);
        P3.setPrix(0.9f);
        P1.setId(1);
        P1.setLibelle("Gazouz");
        P1.setLibelle("Booga");
        P1.setPrix(1.8f);
        System.out.println("--------------- Question 6 ----------------");
        P1.afficher();
        P2.afficher();
        P3.afficher();
        System.out.println("--------------- Question 7 ----------------");
        System.out.println(P1.toString());
        System.out.println("--------------- Question 8 ----------------");
        P1.setExpirationDate(LocalDate.of(1985, 1, 1).atTime(6, 46));
        System.out.println(P1.toString());
        System.out.println("--------------- Partie 2 ----------------");
        Magasin M1 = new Magasin(1, "Nabeul");
        M1.ajouter(P4);
        M1.ajouter(P1);
        M1.ajouter(P2);
        System.out.println(M1.toString());
        System.out.println("--------------- Partie 3 ----------------");
        Produit P5 = new Produit(1, "a", "b", 1.2f);
        Produit P6 = new Produit(1, "a", "b", 1.2f);
        System.out.println("--------------- Question 1----------------");
        System.out.println(M1.comparer(P5, P6));
        System.out.println(P6.comparer(P5));
        System.out.println("--------------- Question 2 ----------------");
        System.out.println(M1.chercher(P1));
        System.out.println(M1.chercher(P6));
        System.out.println("--------------- Question 3----------------");
        Produit P7 = new Produit(3, "a", "b", 1.2f);
        M1.ajouter(P7);
        M1.ajouter(P7);
        System.out.println(M1.toString());
        System.out.println("--------------- Question 4 ----------------");
        M1.suppriemr(P1);
        System.out.println(M1.toString());
        System.out.println("--------------- Question 5 ----------------");
        Magasin M2 = new Magasin(2, "Tunis");
        System.out.println(Magasin.compareNbProduits(M1, M2));
        System.out.println("--------------- Partie 4 héritage ----------------");
        System.out.println("--------------- Question 1 ----------------");
        Magasin MC = new Magasin(10, "Carrefour", "Centre-Ville");
        Magasin MM = new Magasin(11, "Monoprix", "Menzah 6");
        System.out.println(MC.toString());
        System.out.println(MM.toString());
        System.out.println("--------------- Question 2 ----------------");
        // Magasin 1 carrefour
        Caissier C1 = new Caissier(100, 1, "Yacine1", "Khouini", 98);
        Caissier C2 = new Caissier(100, 2, "Yacin2", "Khouini", 134);
        Caissier C3 = new Caissier(100, 3, "Yacine4", "Khouini", 220);
        Responsable R1 = new Responsable(100, 4, "Yacine", "Khouini", 160);
        Vendeur V1 = new Vendeur(5, 5, "Flen", "Fouleni", 10);
        MC.ajouter(C1);
        MC.ajouter(C2);
        MC.ajouter(C3);
        MC.ajouter(R1);
        MC.ajouter(V1);
        System.out.println(MC.toString());
        // Magasin 2 Monoprix
        Caissier C4 = new Caissier(100, 1, "Majd", "Tepsi", 100);
        Vendeur V2 = new Vendeur(5, 2, "Fahed", "F", 0);
        Vendeur V3 = new Vendeur(5, 3, "Wahch", "W", 0);
        Vendeur V4 = new Vendeur(5, 4, "Yacine", "Y", 0);
        Responsable R2 = new Responsable(100, 5, "Ahmed", "A", 100);
        MM.ajouter(C4);
        MM.ajouter(V2);
        MM.ajouter(V3);
        MM.ajouter(V4);
        MM.ajouter(R2);
        Responsable NA = new Responsable(1000, 5, "Ahmed", "A", 100);
        MM.ajouter(NA);
        System.out.println("--------------- Question 3 ----------------");
        System.out.println(C1.toString());
        System.out.println(C2.toString());
        System.out.println(C3.toString());
        System.out.println(R1.toString());
        System.out.println(V1.toString());
        System.out.println(C4.toString());
        System.out.println(V2.toString());
        System.out.println(V3.toString());
        System.out.println(V4.toString());
        System.out.println(R2.toString());
        System.out.println("--------------- Question 4 ----------------");
        MC.ajouter(P1);
        MC.ajouter(P3);
        MM.ajouter(P4);
        MM.ajouter(P5);
        System.out.println("--------------- Question 5 ----------------");
        System.out.println(MM.toString());
        System.out.println(MC.toString());
        System.out.println("--------------- Question 6 ----------------");
        System.out.println(MC.getEemployeesSalaries());
    }
}
