package com.groundgurus.day4;

public class WrapperClassExample {

  public static void main(String[] args) {
    int x = 10; // assign literal value 10 to the variable x

    // valid, Java 5, Auto-boxing and Auto-unboxing
    Integer y = 20; // Auto-boxing, primitive type to wrapper class
    int z = new Integer(30); // Auto-unboxing, wrapper class to primitive type

  }
}
