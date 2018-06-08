package com.noel.gof.comportemental.strategy;

import com.noel.gof.comportemental.strategy.behaviour.ComportementNager;
import com.noel.gof.comportemental.strategy.behaviour.ComportementVoler;

public interface Canard {

  void voler();

  void nager();

  void setComportementVol(ComportementVoler comportementVol);

  void setComportementNager(ComportementNager comportementNager);
}
