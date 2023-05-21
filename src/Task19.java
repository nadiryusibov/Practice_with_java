import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        /* Edv hesablanma qaydasi  18 % olarag gosterilir*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Edvsiz meblegi daxil edin");
        int amount = scan.nextInt();
        double newAmount = amount + (amount * 0.18);
        System.out.println("Edv li qiymet " + newAmount + " manatdir");
    }
}
