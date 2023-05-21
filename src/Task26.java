import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        // Ədədlər ardıcıllığı verilib. Bu ədədləri sonuncu rəqəmlərinə görə,
        // sonuncu rəqəmlər bərabər olduğunda isə ədədlərin özünə gərə artan ardıcıllıqda çeşidləmək lazımdır.

        int [] numbers = {12, 34, 45, 21, 31, 87, 24};
        for (int i = 0; i<numbers.length - 1;i++){
            for (int j = i + 1; j < numbers.length; j++){
                int endNumbers1 = numbers[i] % 10;
                int endNumbers2 = numbers[j] % 10;

                if (endNumbers1 > endNumbers2){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                } else if (endNumbers1 == endNumbers2) {
                    if (numbers[i] > numbers[j]){
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
        }

        System.out.println("son reqemlerine gore ededlerin siralanmasi");
        for (int number : numbers){
            System.out.println(number + " ");
        }

    }
}
