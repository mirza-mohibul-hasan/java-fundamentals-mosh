package org.types;

public class ArithmaticExpressions {
    public static void main(String[] args) {
        // arithmetic operators
        int result = 10 / 3;
        System.out.println(result);
        double result1 = (double) 10 / (double) 3;
        System.out.println(result1);

        // increment and decrement operators
        int x = 1;
        int y = 3;
        System.out.println(x++);
        System.out.println(++y);

        // Other ways
        x = x + 10;
        System.out.println(x);

        // Augmented assignment operator
        y += 10;
        System.out.println(y);
    }
}
