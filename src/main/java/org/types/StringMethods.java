package org.types;

public class StringMethods {
    public static void main(String[] args) {
        String message = "Hello " + "World!!"; //Concatanation
        System.out.println(message);

        System.out.println(message.endsWith("!!")); //Return if end of string is matched
        System.out.println(message.startsWith("Hello")); //Return if start of string is matched
        System.out.println(message.length()); //Return length of string
        System.out.println(message.indexOf('o')); //Index of character we can also use ""
        System.out.println(message.indexOf("Wo")); //Index of start matching index
        System.out.println(message.replace("!!", "??")); //replace target with replacement
        System.out.println(message.toLowerCase()); //convert to lowercase
        System.out.println(message.toUpperCase()); //convert to uppercase
    }
}
