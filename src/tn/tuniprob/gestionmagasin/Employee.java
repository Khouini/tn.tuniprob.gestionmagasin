/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author Trunks
 */
public class Employee {
    private int id;
    private String nom;
    private String adresse;
    private double nb_heures;
    public Employee(int id, String nom, String adresse, double nb_heures){
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nb_heures = nb_heures;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public double getNb_heures() {
        return nb_heures;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nb_heures=" + nb_heures + '}';
    }
    
    public boolean comparer(Employee E) {
        return ((id == E.getId()) && (nom == E.getNom()) && (adresse == E.getAdresse()) && (nb_heures == E.getNb_heures()));
    }
    
}
