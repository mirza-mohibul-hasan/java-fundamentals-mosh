package control.flow;

import java.util.Scanner;

public class ExerciseFizzbuzz {
    public static void main(String[] args) {
        System.out.print("Number: ");
        byte num =  new Scanner(System.in).nextByte();
        if(num % 5 == 0 && num % 3 == 0)
            System.out.println("FizzBuzz");
        else if(num % 5 == 0)
            System.out.println("Fizz");
        else  if(num % 3 == 0)
            System.out.println("Buzz");
        else System.out.println(num);
    }
}
