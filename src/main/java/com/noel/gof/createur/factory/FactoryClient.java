package com.noel.gof.createur.factory;


/**
 * Définit une INTERFACE pour la CREATION d'OBJETS
 * <li></li>mais en laissant aux sous-classes le choix des classes a instancier.
 * <li></li>
 * La Factory permet à une classe de DELEGUER L'INSTANTIATION A DES SOUS-CLASSES
 */
public class FactoryClient {

  public static void main(String[] args) {

    FactoryPizza pizzaFactory = new FactoryPizzaCalzone();
    Pizza pizzaCalzone = pizzaFactory.createPizza();
    System.out.println(pizzaCalzone);

    pizzaFactory = new FactoryPizzaQuatreFromage();
    Pizza pizzaQuatreFromages= pizzaFactory.createPizza();
    System.out.println(pizzaQuatreFromages);

  }

}
