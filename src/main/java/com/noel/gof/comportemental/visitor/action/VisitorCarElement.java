package com.noel.gof.comportemental.visitor.action;

import com.noel.gof.comportemental.visitor.data.Car;
import com.noel.gof.comportemental.visitor.data.ElementBody;
import com.noel.gof.comportemental.visitor.data.ElementEngine;
import com.noel.gof.comportemental.visitor.data.ElementWheel;

public interface VisitorCarElement {
  void visit(ElementWheel wheel);
  void visit(ElementEngine engine);
  void visit(ElementBody body);
  void visitCar(Car car);
}
