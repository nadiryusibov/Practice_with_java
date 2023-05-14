import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
       // İkirəqəmli natural ədədin rəqəmlərinin cəminin kvadratını hesablayın.
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int r1 = a % 10;
        int r2 = a / 10;
        int result = r1 + r2;
        System.out.println(result * result);
    }
}
