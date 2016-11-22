package it_academy_additional.task15;

/**
 * Created by meks on 9/25/2016.
 */
public class Task15 {
    /** Определить сумму элементов массива, расположенных между минимальным и максимальным значениями */
    private static int countMin;
    private static int countMax;
    public static void setMin(int min) {
        countMin = min;
    }

    public static int getMin() {
        return countMin;
    }

    public static void setMax(int max) {
        countMax = max;
    }

    public static int getMax() {
        return countMax;
    }

    public static void main(String[] args) {
        int summ=0;
    int[] elements = new int[20];
        for (int i = 0; i < elements.length; i++) {
        elements[i] = (int) (Math.random() * 20);
        System.out.print(" " + elements[i] + " ");
    }
    int minElemet = elements[0];
        for (int i = 1; i < 20; i++) {
        if (minElemet > elements[i])
            minElemet = elements[i];
    }
        System.out.println("\nМинимальный элемент " + minElemet);
    int maxElemet = elements[0];
        for (int i = 1; i < 20; i++) {
        if (maxElemet < elements[i])
            maxElemet = elements[i];
    }
        System.out.println("Максимальный элемент " + maxElemet);
        for (int i = 0; i < 20; i++) {

        if (minElemet == elements[i]){
            setMin(i);
            System.out.println("Номер минимального элемента " + getMin());
            break;}
    }
        for (int i = 0; i < 20; i++) {
        if (maxElemet == elements[i]){
            setMax(i);
            System.out.println("Номер максимального элемента " + getMax());
            break;}
    }

        if (getMin() > getMax()) {
        for (int i = getMax() + 1; i < getMin(); i++) {
            summ += elements[i];

        }
        System.out.println("Сумма элементов массива, расположенных между минимальным и максимальным значениями " + summ);
    } else {
        for (int i = getMin() + 1; i < getMax(); i++) {
            summ += elements[i];

        }
        System.out.println("Сумма элементов массива, расположенных между минимальным и максимальным значениями " + summ);
    }
}
}