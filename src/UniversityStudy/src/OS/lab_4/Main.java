package UniversityStudy.src.OS.lab_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input K: ");
        int K = Integer.parseInt(reader.readLine());

        System.out.print("Input N: ");
        int N = Integer.parseInt(reader.readLine());

        System.out.print("Input n: ");
        int n = Integer.parseInt(reader.readLine());

        double[] y = new double[K - 1];


        //input
        for (int i = 0; i < y.length; i++) {
            TeilorStep teilorStep = new TeilorStep(i,N,n);
            Thread thread = new Thread(teilorStep);
            thread.start();
            y[i]=teilorStep.getSum();
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
