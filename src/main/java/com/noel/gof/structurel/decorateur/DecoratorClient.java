package com.noel.gof.structurel.decorateur;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * attache DYNAMIQUEMENT des responsabillites SUPPLEMENTAIRES à un objet.
 * Il fournit une alternative souple à la derivation pour étendre les fonctionnalités.
 */
public class DecoratorClient {

  public static void main(String[] args) {

    Produit produit = new ProduitEspresso();
    System.out.println("Prix d'un expresso : " + produit.getPrix());
    assertThat(produit.getPrix()).isEqualTo(ProduitEspresso.PRIX_ESPRESSO);

    Produit espressoEtChantilly = new DecorateurChantilly(produit);
    System.out.println("Prix d'un expresso, avec chantilly : " + espressoEtChantilly.getPrix());
    assertThat(espressoEtChantilly.getPrix()).isEqualTo(ProduitEspresso.PRIX_ESPRESSO + DecorateurChantilly.PRIX_SUPPLEMENT_CHANTILLY);

    Produit espressoEtChantillyEtChocolat = new DecorateurChocolat(espressoEtChantilly);
    System.out.println("Prix d'un expresso, avec chantilly et chocolat : " + espressoEtChantillyEtChocolat.getPrix());
    assertThat(espressoEtChantillyEtChocolat.getPrix()).isEqualTo(ProduitEspresso.PRIX_ESPRESSO + DecorateurChantilly.PRIX_SUPPLEMENT_CHANTILLY + DecorateurChocolat.PRIX_SUPPLEMENT_CHOCOLAT);

  }
}
