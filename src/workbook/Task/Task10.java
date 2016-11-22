package workbook.Task;

/**
 * Created by Sukora Stas on 14.10.2016.
 */
//Имеется целое число. Следует посчитать сумму цифр данного числа.
public class Task10 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100000);
        String str = String.valueOf(n);
        System.out.println(n);
        int sum = 0;

        for (int i = 1; i < str.length() + 1; ++i) {
            char c = str.charAt(str.length() - i);
            int s=Character.getNumericValue(c);
            sum += s;
            System.out.println(c);

        }
        System.out.println(sum);

    }
}
