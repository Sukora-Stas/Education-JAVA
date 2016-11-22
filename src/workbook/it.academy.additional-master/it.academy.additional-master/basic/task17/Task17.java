package it_academy_additional.task17;

/**
 * Created by meks on 9/25/2016.
 */
public class Task17 {
    /**
     * Создать двухмерный квадратный массив, и заполнить его "бабочкой"
     */
    public static void main(String[] args) {
        int[][] mass = new int[6][6];
        for (int i = 0; i < mass.length / 2 + 1; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if ((j < i) || (j >= (mass[i].length - i)))
                    mass[i][j] = 0;
                else
                    mass[i][j] = 1;
            }
        }
        for (int i = mass.length - 1; i >= mass.length / 2; i--) {
            for (int j = 0; j < mass[i].length; j++) {
                if ((j < (mass[i].length - 1 - i)) || (j > i))
                    mass[i][j] = 0;
                else
                    mass[i][j] = 1;

            }
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j]);
            }
            System.out.println("");
        }

    }
}
