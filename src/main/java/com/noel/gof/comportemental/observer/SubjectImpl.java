package com.noel.gof.comportemental.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

  private String data;

  private List<Observer> observers = new ArrayList();

  @Override
  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(data);
    }
  }

  public void setData(String newData) {
    this.data = newData;
    notifyObservers();
  }
}
