import java.util.Arrays;

public class Task27 {
    public static void main(String[] args) {
        /*İmperator Palpatinin gəlişi ilə əlaqədar olaraq anqar 32-də droidlərin sayını artırmaq qərarına gəlindi.
        Böhrandan dolayı yeni droidlər almamaq, lakin bəzi kohnələri atmaq qərarına gəlindi.
        Bilindiyi kimi Palpatin kiçik seriya nömrəli droidləri xoşlamır,
        buna görə də nə tələb olunur - onların içərisindən seriya nömrəsi ən kiçik olan ikisini tapmaq.*/

        /*İki ədəd verin: əvvəlcə – droidlərdən qiymətcə axırıncı olanını
        (beləsini birinci olaraq istifadə etmək lazımdır), sonra isə sonuncudan əvvəlkini.*/

        int[] arr = {49, 100, 23, -100, 157};

        int minNumber = arr[0];
        int maxNumber = arr[1];
        Arrays.sort(arr);
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < minNumber){
//                minNumber = arr[i];
//            }
//            if(arr[i] > maxNumber){
//                maxNumber = arr[i];
//            }
//        }
        System.out.println("min number " + minNumber);
        System.out.println("max number " + maxNumber);
    }
}