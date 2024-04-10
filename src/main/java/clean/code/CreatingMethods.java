package clean.code;

public class CreatingMethods {
    public static void main(String[] args) {
        System.out.println(greetUser("Refat", "Hasan"));
    }
    public static String greetUser(String firstName, String lastName){
        return "Hi " + firstName + " " + lastName;
    }
}
