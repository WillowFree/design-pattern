package com.noel.gof.comportemental.visitor.data;

import com.noel.gof.comportemental.visitor.action.VisitorCarElement;

public class ElementBody implements ElementOfCar {

  public void accept(VisitorCarElement visitor) {
    visitor.visit(this);
  }
}
