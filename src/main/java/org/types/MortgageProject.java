package org.types;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageProject {
    public static void main(String[] args) {
        // Principal the amount of loan you want to get
        // Period means loan you want to get for years
        final byte months = 12;
        final byte percent = 100;

        Scanner scanner =  new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Anual interest rate: ");
        float rate = scanner.nextFloat();

        System.out.print("Years (Periods): ");
        int year = scanner.nextInt();

        float r = rate/percent/months;
        int n = year * months;

        double powerPart = Math.pow(1 + r, n);
        double monthlyPayment = principal * r * powerPart /(powerPart - 1);

        String currency = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        System.out.println(currency);
    }
}
