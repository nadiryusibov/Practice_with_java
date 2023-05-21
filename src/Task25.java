import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        // Switch-case ile basit hesap makinesi
        Scanner scan = new Scanner(System.in);
        System.out.println("emeliyyatla toplama 1,cixma 2,vurma 3, bolme 4");
        System.out.println("1 ci ededi daxil edin");
        int a = scan.nextInt();
        System.out.println("2 ci ededi daxil edin");
        int b = scan.nextInt();
        System.out.println("emeliyyati daxil edin");
        int operand = scan.nextInt();

        switch (operand){
            case 1:
                System.out.println(a + " + " + b + " = " + (a + b) );
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + (a - b) );
                break;
            case 3:
                System.out.println(a + " * " + b + " = " + (a * b) );
                break;
            case 4:
                System.out.println(a + " / " + b + " = " + (float) a / b );
                break;
            default:
                System.out.println("yuxaridaki emeliyyata uygun olani secin !");
                break;
        }

        /*emeliyyatla toplama 1,cixma 2,vurma 3, bolme 4
          1 ci ededi daxil edin
          5
          2 ci ededi daxil edin
          2
          emeliyyati daxil edin
          4
          5 / 2 = 2.5*/

    }
}
