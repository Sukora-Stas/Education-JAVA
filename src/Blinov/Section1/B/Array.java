package Blinov.Section1.B;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Sukora Stas.
 */
public class Array {
//Ввести с консоли n целых чисел и поместить их в массив. На консоль вывести:

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
        bubbleSort(a);
    }

    //5. Элементы, расположенные методом пузырька по убыванию модулей.
    private static void bubbleSort(int[] arr) {
        System.out.println("BubbleSort");
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(arr[j]) < Math.abs(arr[j + 1])) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int anArr : arr) {
            System.out.print(" " + anArr);
        }

    }

    //4. Числа, которые делятся на 5 и на 7.
    private static void Task4(int[] a) {
        System.out.println("Числа, которые делятся на 5 и на 7:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 0 && a[i] % 7 == 0) {
                System.out.println("Ind[" + i + "]= " + a[i]);
            }
        }
        System.out.println();
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
