import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // İki ədədin cəmini hesablamalı.test sayisi nezere alinacag
        Scanner scan = new Scanner(System.in);

        System.out.println("test sayisini daxil edin");
        int testNumber = scan.nextInt();

        for (int i = 0; i < testNumber; i++){
            System.out.println("1 ci ededi daxil edin");
            int number1 = scan.nextInt();
            System.out.println("2 ci ededi daxil edin");
            int number2 = scan.nextInt();
            int sum = number1 + number2;
            System.out.println("ededleri cemi " + sum);
        }
    }
}
