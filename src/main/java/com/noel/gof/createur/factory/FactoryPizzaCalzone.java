package com.noel.gof.createur.factory;

public class FactoryPizzaCalzone implements FactoryPizza {

  public Pizza createPizza() {
    return new PizzaCalzone();
  }

}
