public class Task21 {
    public static void main(String[] args) {
        //  Girilen 2 sayıyı 3.bir değişken kullanmadan değerlerini değiştirme
        int a = 15;
        int b = 25;
        a = a + b;

        b = a - b;
        System.out.println("b = " + b);
        a = a - b;
        System.out.println("a = " + a);

        /*
          b = 15
          a = 25
         */
    }
}
