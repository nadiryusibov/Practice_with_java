public class Task1 {
    public static void main(String[] args) {
        /*Iki deyishen verilir mes: int a = 5; int b = 9;
        Burada ucuncu deyishen istifade etmeden deyerlerinin yerlerini deyisherek cap edin. Cavab int a = 9; int b = 5 olmalidir.*/

        int a = 5;
        int b = 9;

        a = a + b;
        System.out.println("a = " + a);  // output a = 14
        b = a - b;
        System.out.println("b = " + b);   // output b = 5
        a = a - b;
        System.out.println("a = " + a);   // output a = 9

    }
}
