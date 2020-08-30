package com.groundgurus.day4;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Shop {
  private String name;
  private List<Item> items = new ArrayList<>();

  public void addItem(Item item) {
    items.add(item);
  }

  public Item findByItemName(String name) {
    for (Item item : items) {
      if (item != null &&
          item.getName().toLowerCase().startsWith(name.toLowerCase())) {
        return item;
      }
    }

    return null;
  }

  public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Items");

    for (Item item : items) {
      if (item != null) {
        System.out.println("-- " + item.getName());
      }
    }
  }
}
