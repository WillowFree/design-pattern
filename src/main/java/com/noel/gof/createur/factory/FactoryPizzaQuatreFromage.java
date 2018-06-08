package com.noel.gof.createur.factory;

public class FactoryPizzaQuatreFromage implements FactoryPizza {

  public Pizza createPizza() {
    return new PizzaQuatreFromage();
  }

}
