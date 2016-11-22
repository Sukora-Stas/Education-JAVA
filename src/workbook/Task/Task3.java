package workbook.Task;

/**
 * Created by Sukora Stas on 13.10.2016.
 */
//Создайте число. Определите, является ли последняя цифра числа семёркой

public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int a = (int) Math.round(Math.random() * 1000);
            System.out.println(a);
            int m = a % 10;
            if (7 == m) {
                System.out.println("Число последняя цифра которого равна 7: " + a);
            }


        }
    }
}
