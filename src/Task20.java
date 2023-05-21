import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        /* Java Girilen İki Sayının Değerlerini Değiştirme */
        Scanner scan = new Scanner(System.in);
        System.out.println("number 1 entered");
        int number1 = scan.nextInt();
        System.out.println("number 2 entered");
        int number2 = scan.nextInt();
        int change = number1;
        number1 = number2;
        number2 = change;
        System.out.println("number 1 = " + number1);
        System.out.println("number 2 = " + number2);

    }
}
