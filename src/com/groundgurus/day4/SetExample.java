package com.groundgurus.day4;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

  public static void main(String[] args) {
    Set<String> mySet = new HashSet<>();
    mySet.add("Hi");
    mySet.add("Hello");
    mySet.add("Howdy");
    mySet.add("Hi");

    System.out.println(mySet);
  }
}
