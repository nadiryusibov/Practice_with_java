import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        // Tərəfləri a və b olan düzbucaqlının perimetri 2(a+b)-yə, sahəsi isə ab-yə bərabərdir
        Scanner scan = new Scanner(System.in);
        System.out.println("duzbucaglinin perimetri ve sahesini hesaba=layaq");
        System.out.println("duzbucaqlinin enini daxil edin");
        int eni = scan.nextInt();
        System.out.println("duzbucaqlinin uzunlugunu daxil edin");
        int uzunu = scan.nextInt();
        int p = 2*(eni + uzunu);
        int s = eni * uzunu;
        System.out.println("duzbucaglinin perimetri = " + p);
        System.out.println("duzbucaqlinin sahesi = " + s);

    }
}
