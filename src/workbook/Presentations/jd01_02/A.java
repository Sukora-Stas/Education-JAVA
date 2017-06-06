package workbook.Presentations.jd01_02;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Sukora Stas.
 */
public class A {
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
        for (int i = 0; i < n; i++) {
            int a = (int) (Math.random() * 100);
        }


        scanner.close();
    }
}
