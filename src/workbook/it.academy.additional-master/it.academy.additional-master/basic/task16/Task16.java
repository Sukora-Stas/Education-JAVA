package it_academy_additional.task16;

/**
 * Created by meks on 9/25/2016.
 */
public class Task16 {
    /** Создать массив, заполнить случайными элементами, распечатать, повернуть, и cнова распечатать */
    public static void main(String[] args) {
        int[] mass = new int[20];
        for (int i = 0; i < 20; i++) {
            mass[i]=(int)(Math.random()*10+1);
            System.out.print(" "+mass[i]+" ");
        }
        System.out.println("");
        for (int i = (mass.length-1); i>=0; i--) {
            System.out.print(" "+mass[i]+" ");
        }

    }
}
