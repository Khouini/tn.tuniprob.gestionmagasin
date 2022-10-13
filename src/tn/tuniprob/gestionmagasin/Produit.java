/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

import java.time.LocalDateTime;

/**
 *
 * @author Trunks
 */
public class Produit {

    private int id;
    private String libelle, marque;
    private float prix;
    private LocalDateTime expirationDate;

    public void setPrix(float nvPrice) {
        if (prix >= 0) {
            prix = nvPrice;
        }
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getMarque() {
        return marque;
    }

    public float getPrix() {
        return prix;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setId(int nvId) {
        id = nvId;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setExpirationDate(LocalDateTime date) {
        this.expirationDate = date;
    }

    public Produit() {
    }

    public Produit(int id, String libelle, String marque, float prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        if (this.prix >= 0) {
            this.prix = prix;
        }
    }

    public Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;

    }

    public void afficher() {
        System.out.println("ID: " + this.id);
        System.out.println("libelle: " + this.libelle);
        System.out.println("marque: " + this.marque);
        System.out.println("prix: " + this.prix);
        System.out.println("-------------------------------");
    }

    /*public String toString() {
        return "ID: " + id + "\n" + "libelle: " + libelle + "\n" + "marque: " + marque + "\n" + "prix: " + prix + "\nDate: " + expirationDate + "\n";
    }*/
    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + ", expirationDate=" + expirationDate + '}';
    }

    public boolean comparer(Produit P) {
        return ((P.id == id) && (P.libelle == libelle) && (P.prix == prix));
    }

}
