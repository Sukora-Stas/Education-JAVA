package UniversityStudy.src.OS.lab_4;

import java.text.DecimalFormat;

public class TeilorStep extends Thread {

    private double sum;

    private int index;
    private int N;
    private int n;
    private Callback callback;

    public TeilorStep(int index, int N, int n, Callback callback) {
        this.index = index;
        this.N = N;
        this.n = n;
        this.callback = callback;
    }

    @Override
    public void run() {
        double derivative = derivative(index, N, n);
        String formattedDouble = new DecimalFormat("#0.0000000").format(derivative);
        System.out.println("\nid[" + index + "]   " + formattedDouble);
        sum = derivative;
        callback.success(index, sum);
    }

    //stepTeilor
    public double derivative(int stepen, int N, int n) {
        double m;

        if (stepen == 0 || stepen % 2 == 0) {
            return 0;
        }
        if (stepen == 1) {
            m = 0;
            for (int i = 0; i < n; i++) {
                m += (Math.pow(2, stepen) * ((Math.pow(Math.PI, stepen)) / Math.pow(N, stepen))) / factorial(stepen);
            }
            return m;
        }
        m = 0;
        for (int i = 0; i < n; i++) {
            m += ((Math.pow(2, stepen) * -1) * ((Math.pow(Math.PI, stepen)) / Math.pow(N, stepen))) / factorial(stepen);
        }

        return m;
    }


    public int factorial(int a) {
        int y = 1;
        for (int i = 1; i <= a; i++) {
            y *= i;
        }

        return y;
    }

}
