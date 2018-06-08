package com.noel.gof.comportemental.visitor.action;

import com.noel.gof.comportemental.visitor.data.Car;
import com.noel.gof.comportemental.visitor.data.ElementBody;
import com.noel.gof.comportemental.visitor.data.ElementEngine;
import com.noel.gof.comportemental.visitor.data.ElementOfCar;
import com.noel.gof.comportemental.visitor.data.ElementWheel;

public class VisitorCarElementDo implements VisitorCarElement {

  public void visit(ElementWheel wheel) {
    System.out.println("Action = Kicking my " + wheel.getName());
  }

  public void visit(ElementEngine engine) {
    System.out.println("Action = Starting my engine");
  }

  public void visit(ElementBody body) {
    System.out.println("Action = Moving my body");
  }

  public void visitCar(Car car) {
    System.out.println("\nAction = Starting my car :");
    for (ElementOfCar carElement : car.getElements()) {
      carElement.accept(this);
    }
    System.out.println("Started car...");
  }
}