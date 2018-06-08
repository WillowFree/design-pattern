package com.noel.gof.comportemental.strategy;


import com.noel.gof.comportemental.strategy.behaviour.ComportementNager;
import com.noel.gof.comportemental.strategy.behaviour.ComportementNagerEnFlottant;
import com.noel.gof.comportemental.strategy.behaviour.ComportementVoler;
import com.noel.gof.comportemental.strategy.behaviour.ComportementVolerSansAiles;

/**
 * Définit une FAMILLE D'ALGORITHMES, encapsule chacune d'elles et les rend interchangeables
 */
public class StrategyClient {

  public static void main(String[] args) {

    ComportementVoler comportementVoler = new ComportementVolerSansAiles();
    ComportementNager comportementNager = new ComportementNagerEnFlottant();
    Canard canardEnPlastique = new CanardEnPlastique();
    canardEnPlastique.setComportementVol(comportementVoler);
    canardEnPlastique.setComportementNager(comportementNager);

    canardEnPlastique.voler();
    canardEnPlastique.nager();

  }
}
