import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
       /*Bu örnekte kullanıcıya gitmek istediği mesafeyi ve kaç saatte gitmek istediğini soracağız.
       Bu bilgilere göre saatte ortalama kaç km hız ile gitmesi gerektiğini ekrana yazdıracağız.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("getmek istedyin mesafeni yaz ");
        int yol = scan.nextInt();
        System.out.println("nece saatda gedeceyini yaz");
        int saat = scan.nextInt();
        int result = yol / saat;
        System.out.println("getmek istediyin ortalama suret " + result + " km/saat dir");
    }
}
