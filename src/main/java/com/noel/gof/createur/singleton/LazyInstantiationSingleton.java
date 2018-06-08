package com.noel.gof.createur.singleton;

public class LazyInstantiationSingleton {

  private static volatile LazyInstantiationSingleton singleton;

  private LazyInstantiationSingleton() {
  }

  public static LazyInstantiationSingleton getInstance() {
    if (singleton == null) {
      synchronized (LazyInstantiationSingleton.class) {
        if (singleton == null) {
          singleton = new LazyInstantiationSingleton();
        }
      }


    }

    return singleton;
  }

}
