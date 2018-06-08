package com.noel.gof.comportemental.iterateur;


/**
 * fournit un moyen d'ACCEDER EN SEQUENCE à un objet de type AGGREGAT,
 * <li>SANS REVELER sa representation sous-jacentes </li>
 */
public class ClientIterateur {

  public static void main(String[] args) {
    Aggregat aggregat = new AggregatConcret();

    Iterateur<MenuItem> iterateur = aggregat.createIterateur();
    while (iterateur.hasNext()) {
      MenuItem menuItem = iterateur.next();
      System.out.println("Menu : " + menuItem);
//      iterateur.remove(obj);
    }
  }
}
