import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Proqram ikirəqəmli ədədi oxuyur və ədədin hər bir rəqəmini arada boşluq olmaqla ekrana verir.
        Scanner scan = new Scanner(System.in);
        System.out.println("10 - 99 arasinda istenilen natural ededi daxil edin");
        int number = scan.nextInt();
        int qaliq = number % 10;
        int tam = number / 10;

        System.out.println(tam + " " + qaliq);

        /*
         output

         10 - 99 arasinda istenilen natural ededi daxil edin
         45
         4 5

         */
    }

}
