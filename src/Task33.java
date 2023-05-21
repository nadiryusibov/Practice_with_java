import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        // n sayda tam ədəd verilib. Bu ədədləri tərsinə çıxışa verin.
        Scanner scan = new Scanner(System.in);
        System.out.println("reqem daxil edin");
        int number = scan.nextInt();
        int reverse = 0;

        while (number != 0) {
            int module = number % 10;
            System.out.println("module " + module);
            reverse = reverse * 10 + module;
            System.out.println("reverse " +reverse);
            number = number / 10;
            System.out.println("number "+ number);
        }

        System.out.println("Ters cevrilmis veziyyeti: " + reverse);

    }
}
