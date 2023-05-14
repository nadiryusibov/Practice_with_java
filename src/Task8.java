import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //Üçrəqəmli ədəd verilmişdir. Onun rəqəmlərindən hansının - birincinin, yoxsa axırıncının böyük olduğunu müəyyənləşdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("3 reqemli eded daxil edin");
        int a = scan.nextInt();
        int num1 = a / 100;
        int num2 = (a / 10) % 10;
        int num3 = a % 10;

        if (num1 > num2 || num1 > num3){
            System.out.println("=");
        }else if (num2 > num1 || num2 > num3){
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }
    }
}
