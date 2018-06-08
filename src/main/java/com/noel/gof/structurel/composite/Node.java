package com.noel.gof.structurel.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Node implements Composite {

  private String name;
  private List<Component> child = new ArrayList<>();

  public Node(String name) {
    this.name = name;
  }

  @Override
  public void add(Component element) {
    this.child.add(element);
  }

  @Override
  public void remove(Component element) {
    this.child.remove(element);
  }

  @Override
  public List<Component> getChild() {
    // immutability
    return new ArrayList<>(child);
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("node: " + name);
    for (Component component : child) {
      stringBuilder.append("\t child: " + component.getName());
    }
    return stringBuilder.toString();
  }
}
