package com.noel.gof.structurel.composite;

import java.util.List;

public interface Composite extends Component {

  void add(Component element);

  void remove(Component element);

  List<Component> getChild();
}
