package it_academy_additional.task11;

/**
 * Created by meks on 9/24/2016.
 */
public class Task11 {
    /**
     * Определить является ли это число простым
     */
    public static void main(String[] args) {
        int numb = (int) (Math.random() * 1000);
        //int numb =2;
        if (numb == 2 || numb == 3 || numb == 5)
            System.out.println("Число " + numb + " простое");
        else if (numb % 2 == 0 || numb % 3 == 0 || numb % 5 == 0)
            System.out.println("Число " + numb + " не простое");
        else System.out.println("Число " + numb + " простое");
    }
}

