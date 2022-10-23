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
public class ProduitFruit extends Produit {

    final private String type = "Fruit";
    private String saison;

    public ProduitFruit(int id, String libelle, float quantite, String saison) {
        super(id, libelle, quantite);
        this.saison = saison;
    }

    public String getType() {
        return type;
    }

    public String getSaison() {
        return saison;
    }
    

    @Override
    public String toString() {

        return "ProduitFruit{" + "id=" + super.getId() + ", libelle=" + super.getLibelle() + ", quantite=" + super.getQuantite() + ", type=" + type + ", saison=" + saison + '}';
    }

}
