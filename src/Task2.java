public class Task2 {
    public static void main(String[] args) {
        /*
        Iki deyishen verilib mes int a = 5; int b = 9. Ucuncu deyishen istifade etmeden, bitwise operator vasitesi ile
        deyerlerinin yerlerini deyishin. Cavab: int a = 9; int b = 5 olmalidir

         */

        int a = 5;
        int b = 9;
        a = a ^ b;
        System.out.println("a = " + a);  // output a = 12
        b = a ^ b;
        System.out.println("b = " + b);   // output b = 5
        a = a ^ b;
        System.out.println("a = " + a);    // output a = 9
    }
}
