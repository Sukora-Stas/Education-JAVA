package it_academy_additional.task7;

/**
 * Created by meks on 9/7/2016.
 */
public class Task7 {
    public static void main(String[] args) {

        double a = 2, b = 3, c = 2, d = 4, e = 10, f = 5;
        if ((b + d) <= e & (a + c) <= f)
        System.out.println("можно построить 2 дома");
        else if ((a + c) <= e & (b + d) <= f)
            System.out.println("можно построить 2 дома");
        else if ((a + d) <= e & (c + b) <= f)
            System.out.println("можно построить 2 дома");
        else if ((b + c) <= e & (a + d) <= f)
            System.out.println("можно построить 2 дома");
        else
            System.out.println("Нелья построить");
    }
}
