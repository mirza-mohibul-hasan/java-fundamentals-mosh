package control.flow;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        String role = new Scanner(System.in).next();
//        switch (role){
//            case "admin":
//                System.out.println("Admin");
//                break;
//            case "moderator":
//                System.out.println("Moderator");
//                break;
//            default:
//                System.out.println("Guest");
//        }
        //enhanced
        switch (role) {
            case "admin" -> System.out.println("Admin");
            case "moderator" -> System.out.println("Moderator");
            default -> System.out.println("Guest");
        }
    }
}
