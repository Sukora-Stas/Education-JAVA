package it_academy_additional.task10;

/**
 * Created by meks on 9/24/2016.
 */
public class Task10 {
    /**
     * Имеется целое число. Следует посчитать сумму цифр данного числа
     */
    public static void main(String[] args) {
        int numb = (int) (Math.random() * 1000);
        int a, b, c, sum;
        a = numb / 100;
        b = (numb - (a * 100)) / 10;
        c = numb % 10;
        sum = a + b + c;
        System.out.println("Число равно= " + numb);
        System.out.println("Сумма цифр данного числа= " + sum);


    }
}
