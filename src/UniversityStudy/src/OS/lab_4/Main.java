package UniversityStudy.src.OS.lab_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


/*Написать программу нахождения массива K последовательных значений
        функции y[i]=sin(2*PI*i/N) (i=0,1,2...K-1 ) с использованием ряда Тейлора. Поль-
        зователь задает значения K, N и количество n членов ряда Тейлора. Для расчета
        каждого члена ряда Тейлора запускается отдельная нить. Каждая нить выводит на
        экран свой id и рассчитанное значение ряда. Головной процесс суммирует все
        члены ряда Тейлора и полученное значение y[i] записывает в файл*/


public class Main {

    private static double[] y;

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input K: ");
        int K = Integer.parseInt(reader.readLine());

        System.out.print("Input N: ");
        int N = Integer.parseInt(reader.readLine());

        System.out.print("Input n: ");
        int n = Integer.parseInt(reader.readLine());

        y = new double[K - 1];

        Callback callback = (index, value) -> {
            y[index] = value;
        };

        List<Thread> threads = new ArrayList<>();

        //input
        for (int i = 0; i < y.length; i++) {
            TeilorStep teilorStep = new TeilorStep(i, N, n, callback);
            threads.add(new Thread(teilorStep));
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        //output
        for (int i = 0; i < y.length; i++) {
            String formattedDouble = new DecimalFormat("#0.00000").format(y[i]);

        }

    }

}
