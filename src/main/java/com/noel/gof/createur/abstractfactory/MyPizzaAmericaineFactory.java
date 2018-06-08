package com.noel.gof.createur.abstractfactory;

public class MyPizzaAmericaineFactory implements MyAbstractFactory {

  @Override
  public Pate createPate() {
    return new PateAmericaineEpaisse();
  }

  @Override
  public Sauce createSauce() {
    return new SauceTomate();
  }
}
