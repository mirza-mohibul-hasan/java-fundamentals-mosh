package org.types;

public class CastingAndTypeConversion {
    public static void main(String[] args) {
        //Implicit casting (automatic lower type to higher)
        //byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        //Automatic casting
        double a = 1.1;
        double b = a + 2; // 2.0
        System.out.println(b);

        //explicit casting. It only works for compatable type
        double m = 1.1;
        int n = (int)m + 2;
        System.out.println(n);

        //for string we can use wrapper class
        String s = "25";
        int num1 = Integer.parseInt(s) + 2;
        System.out.println(num1);
        System.out.println(Float.parseFloat(s));
        System.out.println(Short.parseShort(s));
        System.out.println(Long.parseLong(s));
        System.out.println(Byte.parseByte(s));
        System.out.println(Double.parseDouble(s));

    }
}
