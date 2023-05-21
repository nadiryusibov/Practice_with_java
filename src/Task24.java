import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        // İf-Else yapılarını kullanarak basit hesap makinesi
        Scanner scan = new Scanner(System.in);
        System.out.println("emeliyyatlar -- toplama,cixma,vurma,bolme");
        System.out.println("1ci ededi daxil edin");
        double a = scan.nextDouble();
        System.out.println("2ci ededi daxil edin");
        double b = scan.nextDouble();
        System.out.println("emeliyyati daxil edin");
        String operand = scan.next();

        if (operand.equals("toplama")){
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (operand.equals("cixma")) {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (operand.equals("vurma")) {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (operand.equals("bolme")) {
            System.out.println(a + " : " + b + " = " + (a / b));
        }else {
            System.out.println("yuxaridaki emeliyyatlara uygun olani yazin");
        }
    }
}
