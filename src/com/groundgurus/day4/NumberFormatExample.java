package com.groundgurus.day4;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExample {

  public static void main(String[] args) {
    NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
    double price = 1231.45;
    System.out.println(nf.format(price));

    NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.GERMANY);
    System.out.println(cf.format(price));

    NumberFormat phFormat = NumberFormat.getCurrencyInstance(new Locale("tl", "PH"));
    System.out.println(phFormat.format(price));
  }
}
