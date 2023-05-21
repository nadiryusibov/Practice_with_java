import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        // n tam ədədi verilir. n!-ı hesablayın. faktorial
        Scanner scan = new Scanner(System.in);
        System.out.println("eded daxil edin");
        int number = scan.nextInt();
        int faktorial = 1;
        for (int i = 1; i <= number; i++){
            faktorial = faktorial * i;
        }

        System.out.println(number + " edednin faktoriali " + faktorial + " dir");
    }
}
