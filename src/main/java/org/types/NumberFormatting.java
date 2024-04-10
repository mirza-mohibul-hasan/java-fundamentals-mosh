package org.types;

import java.text.NumberFormat;

public class NumberFormatting {
    public static void main(String[] args) {
        //NumberFormat currency = new NumberFormat();
        //Remember that NumberFormat is a abstract class. So we can not create instances

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        NumberFormat percentage = NumberFormat.getPercentInstance();
        String result2 = percentage.format(0.1);
        System.out.println(result2);

        //short way
        String result3 = NumberFormat.getPercentInstance().format(0.34);
        System.out.println(result3);
    }
}
