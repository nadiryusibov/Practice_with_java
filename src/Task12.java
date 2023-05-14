import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        // Dörtrəqəmli natural ədədin rəqəmlərinin cəminin kvadratını hesablayın.
        Scanner scan = new Scanner(System.in);
        System.out.println("4 reqemli ededi daxil edin");
        int a = scan.nextInt();
        int r1 = a % 10;  // sonuncu reqem
        int r2 = (a % 1000) / 100;  // evvelden 2ci
        int r3 = ((a % 1000) % 100) / 10;    // sondan 2 ci reqem
        int r4 = a / 1000;   // ilk reqem
        int result = r1 + r2 + r3 + r4;
        System.out.println("4 reqemli ededin cemi = "+result);
        System.out.println("reqemler ceminin kvadrati = "+ result * result);
    }
}
