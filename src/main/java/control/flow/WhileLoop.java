package control.flow;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
/*        int i = 1;
        while(i <= 20){
            if(i%2 == 0) System.out.println("Even: " + i);
            else System.out.println("Odd: " + i);
            i++;
        }*/
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){
            System.out.print("Input: ");
            input =  scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}
