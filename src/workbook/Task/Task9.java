package workbook.Task;

/**
 * Created by Sukora Stas on 14.10.2016.
 */
//как в примере, имеется последовательность случайных чисел, найти и вывести наибольшее из них.
public class Task9 {
    public static void main(String[] args) {
        double sr = 0;
        int max = 0;

        int x = (int) (Math.random() * 20);
        while (x != 0) {
            System.out.println("Chislo x= " + x);
            if (x >= max) {
                max = x;
            }
            ;
            x = (int) (Math.random() * 20);

        }
        System.out.println("Max= " + max);

    }
}
