package it_academy_additional.task4;
import static java.lang.Math.*;
/**
 * Created by meks on 9/7/2016.
 */
public class Task4 {
    public static void main(String[] args) {
        double a=2, b=3, r=2, d;
        d= sqrt(pow(a,2)+pow(b,2));
        System.out.println(d);
        if (d<=(r*2))
            System.out.println("Круглая картонка зыкрывает прямоугольник");
        else
            System.out.println("Круглая картонка не зыкрывает прямоугольник");

    }


}
