import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        // Girilen 2 sayıyı birbirine göre karşılaştırma
        Scanner scan = new Scanner(System.in);
        System.out.println("1 ci ededi daxil edin");
        int a = scan.nextInt();
        System.out.println("2 ci ededi daxil edin");
        int b = scan.nextInt();
        if (a > b){
            System.out.println(a + " ededi " + b + " den boyukdur");
        }else if (a < b){
            System.out.println(a + " ededi " + b + " den kicikdir");
        } else if (a == b) {
            System.out.println("ededler beraberdir");
        } else {
            System.out.println("ededler beraber deyildir");
        }

        /*1 ci ededi daxil edin
         4
         2 ci ededi daxil edin
         9

         4 ededi 9 den kicikdir*/
    }
}
