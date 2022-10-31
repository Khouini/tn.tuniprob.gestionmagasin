/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

import java.time.LocalDateTime;

import java.time.LocalDate;

public class GestionMagasin {

    public static void main(String[] args) throws PrixNegatifException, MagasinPleinException {
        System.out.println("--------------- Prosit 6 exceptions ----------------");
        System.out.println("--------------- Question 3 ----------------");
        Produit P1 = new Produit(1, "Booga");
        Produit P2 = new Produit(2, "Fanta");
        Produit P3 = new Produit(3, "Coca");
        Magasin M = new Magasin(1, "Manzah");
        M.ajouter(P1);
        M.ajouter(P2);
        try {
            M.ajouter(P3);
        } catch (MagasinPleinException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(M.toString());
    }
}
