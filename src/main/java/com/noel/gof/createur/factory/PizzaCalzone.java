package com.noel.gof.createur.factory;

public class PizzaCalzone implements Pizza {

  private String name = "Cette Pizza est une : Calzone";

  @Override
  public String toString() {
    return name;
  }

}
