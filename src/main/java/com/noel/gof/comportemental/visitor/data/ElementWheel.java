package com.noel.gof.comportemental.visitor.data;

import com.noel.gof.comportemental.visitor.action.VisitorCarElement;

public class ElementWheel implements ElementOfCar {

  private String name;

  public ElementWheel(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void accept(VisitorCarElement visitor) {
    visitor.visit(this);
  }
}