import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        // n ədədindəki a rəqəminin sayını hesablamalı.
        Scanner scan = new Scanner(System.in);
        System.out.println("reqem daxil edin");
        int number = scan.nextInt();
        System.out.println("hesablanacag reqem sayi");
        int repeatNumber = scan.nextInt();

        int count = 0;
        while (number != 0){
            int module = number % 10;
            if (module == repeatNumber){
                count ++;
            }
            number = number / 10;
        }
        System.out.println(repeatNumber + " reqemi " + count + " defe tekrar edir");
    }
}
