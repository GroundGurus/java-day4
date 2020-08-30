package com.groundgurus.day4;

public class WineShop extends Shop {
  private boolean areMinorsAllowed;

  // method overriding
  @Override
  public void printDetails() {
    super.printDetails();
    System.out.println("Are minors allowed? " + areMinorsAllowed);
  }
}
