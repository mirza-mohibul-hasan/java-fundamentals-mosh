package control.flow;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Orange"};
        /*for(int i = 0; i< fruits.length; i++){
            System.out.println(fruits[i]);

        }*/
        //enhanced for mean foreach
        for (String fruit : fruits) {
            System.out.println(fruit);

        }
    }
}
