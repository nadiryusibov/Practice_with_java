import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        // dairenin cevresini hesablamag dustur 2 pi r
        Scanner scan = new Scanner(System.in);
        System.out.println("Dairenin cevresinin uzunlugunu hesablanmasi");
        System.out.println("Dairenin radiusunu daxil edin");
        int radius = scan.nextInt();
        System.out.println("Dairenin cevresinin uzunlugu = " + 2 * Math.PI * radius);

        /* Dairenin cevresinin uzunlugunu hesablanmasi
           Dairenin radiusunu daxil edin
           4
           Dairenin cevresinin uzunlugu = 25.132741228718345 */
    }
}
