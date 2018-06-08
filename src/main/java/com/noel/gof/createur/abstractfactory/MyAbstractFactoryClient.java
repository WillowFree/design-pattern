package com.noel.gof.createur.abstractfactory;

/**
 * Fournit une INTERFACE pour créer une FAMMILLE d'OBJETS APPARENTES,
 * <li></li>
 * sans avoir à spécifier leurs classes concrètes
 */
public class MyAbstractFactoryClient {


  public static void main(String[] args) {

    MyAbstractFactory abstractFactory = new MyPizzaQuatreFromagesFactory();
    Pate pate = abstractFactory.createPate();
    Sauce sauce = abstractFactory.createSauce();
    System.out.println("Pizza Quatre Formages, pate=" + pate + ", sauce=" + sauce);

    abstractFactory = new MyPizzaAmericaineFactory();
    pate = abstractFactory.createPate();
    sauce = abstractFactory.createSauce();
    System.out.println("Pizza Américaire, pate=" + pate + ", sauce=" + sauce);
  }
}
