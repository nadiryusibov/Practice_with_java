import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        // Verilmiş üçrəqəmli natural ədədin sonuncu rəqəminin birinci rəqəmə bölünməsindən alınan qalığı hesablayın.
        Scanner scan = new Scanner(System.in);
        System.out.println("3 reqemli ededi daxil edin");
        int a = scan.nextInt();
        int r1 = a % 10;
        int r2 = (a / 100);
        int result = r1 % r2;
        System.out.println("ədədin sonuncu rəqəminin birinci rəqəmə bölünməsindən alınan qalığ = " + result);
    }
}
