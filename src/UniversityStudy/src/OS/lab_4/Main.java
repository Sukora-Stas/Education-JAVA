package UniversityStudy.src.OS.lab_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

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
            y[index]=value;
        };

        List<Thread> threads = new ArrayList<>();

        //input
        for (int i = 0; i < y.length; i++) {
            TeilorStep teilorStep = new TeilorStep(i, N, n, callback);
            threads.add(new Thread(teilorStep));
//            Thread thread = new Thread(teilorStep);
//            thread.start();
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }


            /*Thread main=Thread.currentThread();
            main.wait();*/


        //output
        for (int i = 0; i < y.length; i++) {
            String formattedDouble = new DecimalFormat("#0.00000").format(y[i]);
            System.out.println(formattedDouble);
        }


    }

}
