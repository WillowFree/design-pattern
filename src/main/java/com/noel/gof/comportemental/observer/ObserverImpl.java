package com.noel.gof.comportemental.observer;

public class ObserverImpl implements Observer {

  public ObserverImpl(Subject subject) {
    subject.addObserver(this);
  }

  public void update(String newData) {
    displayNewData(newData);
  }

  private void displayNewData(String newData) {
    System.out.println("new Data value from ObserverImpl is : " + newData);
  }
}
