import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // Tərəflərinin uzunluğu verilmiş üçbucağın növünü müəyyənləşdirməli (bərabərtərəfli, bərabəryanlı, müxtəliftərəfli).
        // 3 tam eded verek bunla a,b,c seklinde olacag ucbucagin terefleri kimi

        Scanner scan = new Scanner(System.in);
        System.out.println("a ni daxil edin");
        int a = scan.nextInt();
        System.out.println("b ni daxil edin");
        int b = scan.nextInt();
        System.out.println("c ni daxil edin");
        int c = scan.nextInt();
        if (a == b && b == c){
            System.out.println("Beraberterefli ucbucag");
        } else if (a == b || b == c || a == c) {
            System.out.println("Beraberyanli ucbucag");
        }else {
            System.out.println("Muxtelifterefli ucbucag");
        }
    }
}
