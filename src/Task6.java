import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
      //  Üçrəqəmli ədəd verilir. Onun rəqəmlərinin hasilini hesablamalı.
        Scanner scan = new Scanner(System.in);
        System.out.println("3 reqemli eded daxil edin");
        int a = scan.nextInt();
        int r1 = a % 10;
        int r2 = a / 10;
        int r3 = r2 / 10;
        int r4 = r2 % 10;
        System.out.println("cavab " + (r1 * r3 * r4));
    }
}
