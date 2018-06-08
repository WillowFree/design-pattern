package com.noel.gof.comportemental.iterateur;

/**
 * fournit un moyen d'ACCEDER EN SEQUENCE à un objet de type AGGREGAT,
 * <li>SANS REVELER sa representation sous-jacentes </li>
 */
public interface Iterateur<E> {

  boolean hasNext();

  E next();

  void remove(E e);
}
