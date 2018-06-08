package com.noel.gof.createur.abstractfactory;

public class MyPizzaQuatreFromagesFactory implements MyAbstractFactory {

  @Override
  public Pate createPate() {
    return new PateFine();
  }

  @Override
  public Sauce createSauce() {
    return new SauceTomate();
  }
}
