package UniversityStudy.src.OS.lab_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input K: ");
        int K = Integer.parseInt(reader.readLine());

        System.out.print("Input N: ");
        double N = Double.parseDouble(reader.readLine());

        /*System.out.print("Input n: ");
        int n = Integer.parseInt(reader.readLine());*/

        double[] y = new double[K - 1];

        for (int i = 0; i < y.length; i++) {
            double test=Math.sin((2 * Math.PI * i) / N);
////            String formattedDouble = String.format("%.10f", test);
//            String formattedDouble = new DecimalFormat("#0.0000000000").format(test);
//            System.out.println(formattedDouble);
            y[i] = test;
        }















       /* //output
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }*/




      /*  double step = (Math.PI / 2) / ((N - 1) / 2);
        System.out.println("--------------------------------------------------------");
        System.out.println("|     x     |   sin(x)   | tailor_sin(x) |  difference  |");
        System.out.println("--------------------------------------------------------");
        for (double i = (-Math.PI / 2); i <= (Math.PI / 2); i += step) {
            double math_sin = Math.sin(step);
            double tailor_sin = i - Math.pow(i, 3.0) / factorial(3.0) + Math.pow(i, 5.0) / factorial(5.0);
            double diff = math_sin - tailor_sin;
            System.out.printf("| %1.6f |  %1.6f  |   %1.6f   |   %1.6f   |", i,
                    math_sin, tailor_sin, diff);
            System.out.println();
        }
    }

    public static double factorial(Double n) {
        double ret = 1.0;
        for (double i = 1.0; i <= n; ++i)
            ret *= i;
        return ret;
    }*/
    }
}
