package UniversityStudy.src.Kprog.lab1;

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

        int[] arr;
        int[] arr1 = array.getArr1();
        int[] arr2 = array.getArr2();
        if (arr1.length >= arr2.length) {
            arr = new int[arr1.length];
            for (int i = 0; i < arr.length; i++) {
                crossing(arr1, arr2, arr, i);
            }
        } else {
            arr = new int[arr2.length];
            for (int i = 0; i < arr.length; i++) {
                crossing(arr2, arr1, arr, i);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int[] crossing(int[] arr1, int[] arr2, int[] arr, int index) {
        try {
            if (arr1[index] == arr2[index]) {
                arr[index] = arr1[index];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            arr[index] = arr1[index];
        }
        return arr;
    }

}
