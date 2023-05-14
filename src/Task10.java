import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // Dördrəqəmli natural ədəddən onun orta rəqəmlərindən ibarət olan ikirəqəmli ədəd düzəldin.
        Scanner scan = new Scanner(System.in);
        System.out.println("4 reqemli eded daxil edin");
        int a = scan.nextInt();
        int middleNumber = (a % 1000) / 10;
        System.out.println("orta reqemler " + middleNumber);

        // output
        // 3678
        // orta reqemler 67
    }
}
