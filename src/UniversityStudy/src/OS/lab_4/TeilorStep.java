package UniversityStudy.src.OS.lab_4;

public class TeilorStep extends Thread {

//    private double[] y;

    private int i;
    private int N;
    private int n;

    private double sum;


    public TeilorStep(int i,int N,int n){
        this.i=i;
        this.N=N;
        this.n=n;
    }

    @Override
    public void run() {
            double derivative = derivative(i, N, n);
            System.out.println("id["+i+"]   "+derivative);
            sum = derivative;
    }

    //stepTeilor
    public double derivative(int stepen, int N, int n) {
        if (stepen == 0 || stepen % 2 == 0) {
            return 0;
        }
        if (stepen == 1) {
            return (2 * ((Math.PI) / ((Math.pow(Math.PI, stepen))) / factorial(stepen)));
        }
        double m = 0;
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

    public double getSum() {
        return sum;
    }
}
