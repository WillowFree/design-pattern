package com.noel.gof.comportemental.visitor.action;

import com.noel.gof.comportemental.visitor.data.Car;
import com.noel.gof.comportemental.visitor.data.ElementBody;
import com.noel.gof.comportemental.visitor.data.ElementEngine;
import com.noel.gof.comportemental.visitor.data.ElementOfCar;
import com.noel.gof.comportemental.visitor.data.ElementWheel;

public class VisitorCarElementPrint implements VisitorCarElement {

  public void visit(ElementWheel wheel) {
    System.out.println("Action = Visiting " + wheel.getName() + " wheel");
  }

  public void visit(ElementEngine engine) {
    System.out.println("Action = Visiting engine");
  }

  public void visit(ElementBody body) {
    System.out.println("Action = Visiting body");
  }

  public void visitCar(Car car) {
    System.out.println("\nAction = Visiting car :");
    for (ElementOfCar element : car.getElements()) {
      element.accept(this);
    }
    System.out.println("Visited car...");
  }
}