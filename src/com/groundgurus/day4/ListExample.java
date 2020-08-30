package com.groundgurus.day4;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

  public static void main(String[] args) {
    // Java 5, they add Generics <Type>
    // statically typed -> strict restriction of types
    // dynamically typed -> less restriction of types
    List<String> myList = new ArrayList<>();
    myList.add("Hi"); // 0
    myList.add("Hello"); // 1
    myList.add("Howdy"); // 2
    myList.add("Hi"); // 3

    System.out.println(myList);
    System.out.println(myList.get(2));
  }
}
