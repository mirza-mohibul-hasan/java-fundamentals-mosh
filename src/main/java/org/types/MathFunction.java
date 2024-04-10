package org.types;

public class MathFunction {
    public static void main(String[] args) {
        int result1 = (int)Math.round(10.3F);
        System.out.println(result1);

        double result2 = Math.ceil(10.3);
        System.out.println(result2);

        System.out.println(Math.floor(10.3));

        System.out.println(Math.max(10, 15));
        System.out.println(Math.min(10.5F, 34.7F));


        System.out.println(Math.random());
        System.out.println(Math.round(Math.random()*100));
    }
}
