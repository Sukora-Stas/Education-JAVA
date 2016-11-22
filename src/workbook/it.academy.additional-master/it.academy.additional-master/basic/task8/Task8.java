package it_academy_additional.task8;

/**
 * Created by meks on 9/24/2016.
 */
public class Task8 {
    /** Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а произведение, т.е. факториал числа */
    public static void main(String[] args) {
        long fact=1;
        for (int i = 1; i < 6; i++) {
            fact*=i;
            System.out.println(fact);
        }

    }
}
