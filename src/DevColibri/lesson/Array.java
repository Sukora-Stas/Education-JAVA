package DevColibri.lesson;

import java.util.Scanner;

/**
 * Created by Sukora Stas.
 */
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int m = scanner.nextInt();
        int[] arr = inPutArray(m);
        outPutArray(arr);
    }

    static void outPutArray(int[] arr) {
        for (int n : arr) {
            System.out.println(n);
        }
    }

    static int[] inPutArray(int m) {
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = (int) (Math.random() * 200);
        }
        return arr;
    }

}
