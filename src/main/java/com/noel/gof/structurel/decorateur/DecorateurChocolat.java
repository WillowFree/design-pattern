package com.noel.gof.structurel.decorateur;

public class DecorateurChocolat implements Decorateur {

  public static double PRIX_SUPPLEMENT_CHOCOLAT = 0.5;

  private Produit produitADecorer;

  public DecorateurChocolat(Produit produitADecorer) {
    this.produitADecorer = produitADecorer;
  }

  public double getPrix() {
    return produitADecorer.getPrix() + PRIX_SUPPLEMENT_CHOCOLAT;
  }
}
