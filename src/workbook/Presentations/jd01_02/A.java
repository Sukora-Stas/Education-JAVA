package workbook.Presentations.jd01_02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Sukora Stas.
 */
public class A {
//    private static int[] m;

    /**
     * Ввести n чисел с консоли через пробел.
     * Преобразовать полученную строку в массив целых чисел, для этого удобно использовать конструкцию вида
     * <p>
     * String[] strMas= line.split(" ");
     * int[] intMas= new int[strMas.length];
     * for(int j = 0; j < strMas.length; j++){
     * intMas[j] = Integer.parseInt(strMas[j]);
     * }
     * <p>
     * 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
     * 2. Вывести на консоль те числа, длина которых меньше среднего арифметического.
     * 3. Найтичисло, состоящеетолькоизразличныхцифр. Еслитакихчиселнесколько, найтипервоеизних.
     **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = scanner.nextInt();
        scanner.close();
        int a;
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            a = (int) (Math.random() * 100);
            m[i] = a;
        }

        System.out.println(Arrays.toString(m));


    }
}
