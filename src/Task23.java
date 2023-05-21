import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        // Beden kutle index ni yazag
        // Beden Kitle İndeksi = Kilo (kg) / Boy(m)*Boy

        Scanner scan = new Scanner(System.in);
        System.out.println("boyunuzu daxil edin");
        float boy = scan.nextFloat();
        System.out.println("kilonuzu daxil edin");
        float kilo = scan.nextFloat();
        float bki = kilo / (boy * boy);
        System.out.println("beden kutle indeksiniz " + bki);

        if(bki < 18){
            System.out.println("zeif beden");
        } else if (bki < 25) {
            System.out.println("orta beden");
        } else if (bki < 30) {
            System.out.println("biraz kok beden");
        } else if (bki < 35) {
            System.out.println("kok beden");
        }else {
            System.out.println("obez");
        }

        /*boyunuzu daxil edin
         1,72
         kilonuzu daxil edin
         75
         beden kutle indeksiniz 25.351542
         biraz kok beden */
    }
}
