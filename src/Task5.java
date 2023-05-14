import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Informatika dərsinizdə sizə yəqin ki, ədədi bir say sistemindən digərinə çevirməyi və bu kimi oxşar əməliyyatları yerinə yetirməyi öyrətmişlər.
        // Bu biliklərinizi nümayiş etdirmə zamanı gəlmişdir. Verilmiş ədədin ikilik yazılışındakı birlərin sayını verməli.


        Scanner scan = new Scanner(System.in);
        System.out.println("eded daxil edin");
        int number = scan.nextInt();
        int count = 0; // Birlərin sayını qeyd etmək üçün sayaç

        while (number > 0) {
            if (number % 2 == 1) {
                count++;
            }
            number = number / 2;
        }

        System.out.println("ikilik sistemde birlərin sayı: " + count);
    }
}
