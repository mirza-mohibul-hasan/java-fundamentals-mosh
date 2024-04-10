package control.flow;

public class IfElse {
    public static void main(String[] args) {
        int temp = 32;
        if(temp >  30){
            System.out.println("It's a hot day");
            System.out.println("Drink Water");
        } else if(temp > 20 && temp <= 30)
            System.out.println("It's a beautiful day");
        else
            System.out.println("It's a cold day");

        //simplify
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);
    }
}
