package control.flow;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i<= 20; i++){
            if (i == 15)
                continue;
            else if( i == 17)
                break;
            System.out.println(i);
        }
    }
}
