package com.noel.gof.comportemental.observer;

/**
 * definit une relation de type UN A PLUSIEURS de facon que lorsqu'un objet change d'état, tous ceux
 * qui en dépendent en soient notifiés AUTOMATIQUEMENT
 */
public class ObserverClient {

  public static void main(String[] args) {

    Subject subject = new SubjectImpl();
    Observer observer = new ObserverImpl(subject);

    subject.setData("This is my first Data");
    subject.setData("This is my second Data");

    subject.removeObserver(observer);

  }
}
