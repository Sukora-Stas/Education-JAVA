package UniversityStudy.src.OS.lab_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
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
            double derivative = derivative(i,N,n);
            y[i] = derivative;
        }

//output
        for (int i = 0; i < y.length; i++) {
            String formattedDouble = new DecimalFormat("#0.00000").format(y[i]);
            System.out.println(formattedDouble);
        }


    }

    //stepTeilor
    public static double derivative(int stepen, int N,int n) {
        if (stepen == 0 || stepen % 2 == 0) {
            return 0;
        }
        if (stepen == 1) {
            return (2 * ((Math.PI) / ((Math.pow(Math.PI, stepen))) / factorial(stepen)));
        }
        double m=0;
        for (int i = 0; i < n; i++) {
            m+=((Math.pow(2, stepen) * -1) * ((Math.pow(Math.PI, stepen)) / Math.pow(N,stepen))) / factorial(stepen);
        }

        return m;
    }

    public static int factorial(int a) {
        int y = 1;
        for (int i = 1; i <= a; i++) {
            y *= i;
        }

        return y;
    }


}
