import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        // İldəki ayın nömrəsini ifadə edən n (1 ≤ n ≤ 12) tam ədədi verilmişdir.
        // n-in verilmiş qiymətinə görə uyğun ayın adını verin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Ayin indexini daxil edin");
        int monthNumber = scan.nextInt();
        switch (monthNumber){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("Aprel");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("duzgun ay indexini daxil etmediniz");
                break;
        }
    }
}
