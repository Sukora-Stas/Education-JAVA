package workbook.Task;

/**
 * Created by Sukora Stas on 14.10.2016.
 */
//Изменить пример с суммой чисел таким образом, чтобы расчитывалась не сумма, а произведение, т.е. факториал числа
public class Task8 {
    public static void main(String[] args) {
        long sum = 1;
        int i = 1;
        while (i <= 50) {
            sum *= i;
            i++;
            System.out.println("Шаг[" + i + "] " + sum);
        }
        System.out.println();
        System.out.println(sum);
    }
}
