package com.noel.gof.comportemental.visitor.data;

import com.noel.gof.comportemental.visitor.action.VisitorCarElement;

/**
 * Accept
 */
public interface ElementOfCar {

  void accept(VisitorCarElement visitor);
}
