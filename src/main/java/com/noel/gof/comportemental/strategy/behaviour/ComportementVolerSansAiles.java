package com.noel.gof.comportemental.strategy.behaviour;

public class ComportementVolerSansAiles implements ComportementVoler {

  public void voler() {
    System.out.println("voler=impossible, faire de petits sauts");
  }
}
