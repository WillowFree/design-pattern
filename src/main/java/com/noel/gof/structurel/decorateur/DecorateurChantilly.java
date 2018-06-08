package com.noel.gof.structurel.decorateur;

public class DecorateurChantilly implements Decorateur {

  public static final double PRIX_SUPPLEMENT_CHANTILLY = 0.8;

  private Produit produitADecorer;

  public DecorateurChantilly(Produit produitADecorer) {
    this.produitADecorer = produitADecorer;
  }

  public double getPrix() {
    return produitADecorer.getPrix() + PRIX_SUPPLEMENT_CHANTILLY;
  }
}
