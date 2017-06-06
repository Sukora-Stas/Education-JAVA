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
     * 3. Найтичисло, состоящее только из различных цифр. Если так их чисел несколько, найти первое из них.
     **/
    public static void main(String[] args) {
        System.out.println("Автоматический ввод");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = scanner.nextInt();
        int a;
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            a = (int) (Math.random() * 100);
            m[i] = a;
        }
        System.out.println("Auto " + Arrays.toString(m));
        scanner.close();

        System.out.println("Ручной ввод:");
        String line = "25 48 69 84 56 47 85 2 23 45 68 4 23 5 4 3";

        String[] strMas = line.split(" ");
        int[] intMas = new int[strMas.length];
        for (int j = 0; j < strMas.length; j++) {
            intMas[j] = Integer.parseInt(strMas[j]);
        }

        System.out.println(Arrays.toString(intMas));

        int z, x;
        z = m.length;
        x = intMas.length;
        System.out.println("lenth Z = " + z);
        System.out.println("lenth X = " + x);
        if (z > x) {
            System.out.println("самое длинное число это массив Z");
            System.out.println("самое короткое число это массив X");
        } else {
            System.out.println("самое длинное число это массив X");
            System.out.println("самое короткое число это массив Z");
        }




    }
}
