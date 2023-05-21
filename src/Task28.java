import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        // n ədədi verilir. Sizin vəzifəniz - yalnız bit əməliyyatlarından istifadə etməklə
        // ədədin ikilik yazılışında sağdan birinci vahidi sıfırla əvəz etməkdən ibarətdir.

        Scanner scan = new Scanner(System.in);
        System.out.println("bir eded daxil edin");
        int n = scan.nextInt();
        int result = n & (n - 1);
        System.out.println(result);
    }
}
