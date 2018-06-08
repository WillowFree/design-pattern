package com.noel.gof.structurel.decorateur;

public class ProduitEspresso implements Produit {

  public static final double PRIX_ESPRESSO = 2.5;

  public double getPrix() {
    return PRIX_ESPRESSO;
  }
}
