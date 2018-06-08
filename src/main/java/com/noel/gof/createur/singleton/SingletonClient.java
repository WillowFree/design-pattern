package com.noel.gof.createur.singleton;

/**
 * Garantit qu'une classe n'a qu'UNE SEULE INSTANCE
 * <li></li>
 * Et fournit un POINT ACCES GLOBAL à cette instance
 */
public class SingletonClient {

  public static void main(String[] args) {
    EagerInstantiationSingleton singleton = EagerInstantiationSingleton.getInstance();
  }

}
