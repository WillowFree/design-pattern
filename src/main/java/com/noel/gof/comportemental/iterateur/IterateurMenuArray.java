package com.noel.gof.comportemental.iterateur;


public class IterateurMenuArray<MenuItem> implements Iterateur<MenuItem> {

  private MenuItem[] menuItems;
  int position = 0;


  public IterateurMenuArray(MenuItem[] list) {
    this.menuItems = list;
  }

  @Override
  public boolean hasNext() {
    if(position >= menuItems.length || menuItems[position] == null) {
      return false;
    }
    return true;
  }

  @Override
  public MenuItem next() {
    MenuItem  menuItem = menuItems[position];
    position = position +1;
    return menuItem;
  }

  @Override
  public void remove(MenuItem e) {
    menuItems[position] = null;
  }
}
