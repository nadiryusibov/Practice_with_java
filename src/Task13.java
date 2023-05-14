import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        // Dördrəqəmli natural ədədin kənardakı rəqəmlərinin cəmini hesablayın.
        Scanner scan = new Scanner(System.in);
        System.out.println("4 reqemli eded daxil edin");
        int a = scan.nextInt();
        int r1 = a % 10;  // sonuncu eded
        int r2 = a / 1000;  // ilk eded
        int result = r1 + r2;
        System.out.println("ededlerin cemi = " + result);

        // output
        // 9873
        // ededlerin cemi = 12
    }
}
