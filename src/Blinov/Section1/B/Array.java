package Blinov.Section1.B;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Sukora Stas.
 */
public class Array {

    public static void main(String[] args) {
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
        EvenAndNorEven(a);
        Max(a);
        Min(a);
        Task3(a);
        Task4(a);
    }

    //4. Числа, которые делятся на 5 и на 7.
    private static void Task4(int[] a) {
        System.out.println("Числа, которые делятся на 5 и на 7:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 0 && a[i] % 7 == 0) {
                System.out.println("Ind[" + i + "]= " + a[i]);
            }
        }
    }

    //3. Числа, которые делятся на 3 или на 9.
    private static void Task3(int[] a) {
        System.out.println("Числа, которые делятся на 3 или на 9:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0 || a[i] % 9 == 0) {
                System.out.println("Ind[" + i + "]= " + a[i]);
            }
        }
    }

    //2. Наибольшее и наименьшее число.
    private static void Max(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int anA : a) {
            max = Math.max(max, anA);
        }
        System.out.println("Максимальный элмента массива: " + max);
    }


    private static void Min(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int anA : a) {
            min = Math.min(min, anA);
        }
        System.out.println("Минимальный элемент массива: " + min);
    }

    //1. Четные и нечетные числа.
    private static void EvenAndNorEven(int[] a) {
        System.out.println("Чётные элементы: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("Ind[" + i + "]= " + a[i]);
            }
        }
        System.out.println("Не чётные элементы: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println("Ind[" + i + "]= " + a[i]);
            }
        }

    }

}
