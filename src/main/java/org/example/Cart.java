package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
  List<String> items;

  public Cart(){
    items = new ArrayList<>();
  }

  public boolean addItem(String item) {
    items.add(item);
    return true;
  }
}
