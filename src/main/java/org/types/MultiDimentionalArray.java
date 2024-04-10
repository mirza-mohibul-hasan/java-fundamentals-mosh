package org.types;

import java.util.Arrays;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        int [][] numbers = new int[2][3];
        numbers[0][0] = 3;
        numbers[0][1] = 4;
        numbers[1][0] = 5;
        numbers[1][1] = 6;
        System.out.println(Arrays.deepToString(numbers));

        int [][] arr = {{3, 4}, {5, 6}};
        System.out.println(Arrays.deepToString(arr));
    }
}
