package com.noel.gof.structurel.composite;

public class Leaf implements Component {

  private String name;

  public Leaf(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }
}
