package com.noel.gof.comportemental.strategy;

import com.noel.gof.comportemental.strategy.behaviour.ComportementNager;
import com.noel.gof.comportemental.strategy.behaviour.ComportementVoler;

public class CanardEnPlastique implements Canard {

  private ComportementVoler comportementVoler;

  private ComportementNager comportementNager;

  public void voler() {
    comportementVoler.voler();
  }

  public void nager() {
    comportementNager.nager();
  }

  @Override
  public void setComportementVol(ComportementVoler comportementVol) {
    this.comportementVoler = comportementVol;
  }

  @Override
  public void setComportementNager(ComportementNager comportementNager) {
    this.comportementNager = comportementNager;
  }
}
