import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pluyusun olmasi ucun eded daxil edin");
        int size = scan.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == (size / 2) + 1 || i == (size / 2) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
