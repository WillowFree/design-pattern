package com.noel.gof.comportemental.visitor;

import com.noel.gof.comportemental.visitor.action.VisitorCarElement;
import com.noel.gof.comportemental.visitor.action.VisitorCarElementDo;
import com.noel.gof.comportemental.visitor.action.VisitorCarElementPrint;
import com.noel.gof.comportemental.visitor.data.Car;

/**
 * permet une SEPARATION précise entre DONNEES et TRAITEMENTS.
 *
 * <li></li>
 * Il est le compagnon idéal du pattern COMPOSITE.
 *
 * @See : https://fr.wikibooks.org/wiki/Patrons_de_conception/Visiteur
 *
 */
public class VisitorTest {

  public static void main(String[] args) {

    Car car = new Car();

    VisitorCarElement printVisitor = new VisitorCarElementPrint();
    VisitorCarElement doVisitor = new VisitorCarElementDo();

    printVisitor.visitCar(car);
    doVisitor.visitCar(car);
  }
}
