package it_academy_additional.task9;

/**
 * Created by meks on 9/24/2016.
 */
public class Task9 {
    /**
     * Из последовательности случайных чисел, найти и вывести наибольшее из них
     */
    public static void main(String[] args) {
        int a = (int) (Math.random() * 20);
        int b = (int) (Math.random() * 20);
        int c = (int) (Math.random() * 20);
        if (a > b) {
            if (a > c) {
                System.out.println("наибольшее число а: " + a);
            } else {
                System.out.println("наибольшее число с: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("наибольшее число b: " + b);
            } else
                System.out.println("наибольшее число с: " + c);
        }
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
    }
}
