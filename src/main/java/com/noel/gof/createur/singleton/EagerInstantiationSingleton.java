package com.noel.gof.createur.singleton;

public class EagerInstantiationSingleton {

  private static EagerInstantiationSingleton singleton = new EagerInstantiationSingleton();

  private EagerInstantiationSingleton(){}

  public static EagerInstantiationSingleton getInstance() {
    return singleton;
  }

}
