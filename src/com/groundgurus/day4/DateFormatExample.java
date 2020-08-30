package com.groundgurus.day4;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatExample {

  public static void main(String[] args) {
    DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT,
        DateFormat.SHORT, new Locale("en", "PH"));
    System.out.println(df.format(new Date()));
  }
}
