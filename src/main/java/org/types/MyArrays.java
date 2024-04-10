package org.types;

import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        int [] arr = {1, 5, 0, 7, 4, 9};
        System.out.println(arr.length);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
     }
}
