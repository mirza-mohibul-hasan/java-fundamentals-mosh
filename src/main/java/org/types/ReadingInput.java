package org.types;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your Name: ");
        String name = scanner.nextLine().trim();//trim for removing extra space

        System.out.print("Your Gender: ");
        String gender = scanner.next();

        System.out.print("Your Age: ");
        int age = scanner.nextInt();

        System.out.print("Your Height in meter: ");
        double height = scanner.nextDouble();

        System.out.println("Your name: " + name);
        System.out.println("Your gender: " + gender);
        System.out.println("Your age: "+ age);
        System.out.println("Your height: " + height);
    }
}
