package com.noel.gof.createur.factory;

public class PizzaQuatreFromage implements Pizza {

  private String name = "Cette Pizza est une : Quatre fromages";

  @Override
  public String toString() {
    return name;
  }
}
