package UniversityStudy.src.Kprog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Sukora Stas.
 */

/*
* Создать класс, в котором реализовать функции для работы с одномерными массивами:
            а) получить пересечение элементов массивов;
            б) получить объединение элементов массивов.
Память под массивы отводить динамически. Использовать конструктор с параметрами. Деструктор должен освобождать память, выделенную под массивы.
* */
public class lab1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input arr[1].size= ");
        int a = Integer.parseInt(reader.readLine());

        System.out.print("Input arr[2].size= ");
        int b = Integer.parseInt(reader.readLine());

        Array array = new Array(a, b);

        System.out.println("arr1= " + Arrays.toString(array.getArr1()));
        System.out.println("arr2= " + Arrays.toString(array.getArr2()));

    }

    private static class Array {
        private int[] arr1;
        private int[] arr2;

        public Array(int size_arr1, int size_arr2) {
            arr1 = new int[size_arr1];
            arr2 = new int[size_arr2];
        }

        private int[] random(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 100);
            }
            return arr;
        }

        public int[] getArr1() {
            return random(arr1.length);
        }

        public int[] getArr2() {
            return random(arr2.length);
        }

    }
}
