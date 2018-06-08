package com.noel.gof.comportemental.visitor.data;

public class Car {

  private ElementOfCar[] elements;

  public ElementOfCar[] getElements() {
    return elements.clone(); // Retourne une copie du tableau de références.
  }

  public Car() {
    this.elements = new ElementOfCar[]
        {
            new ElementWheel("front left"),
            new ElementWheel("front right"),
            new ElementWheel("back left"),
            new ElementWheel("back right"),
            new ElementBody(),
            new ElementEngine()
        };
  }
}
