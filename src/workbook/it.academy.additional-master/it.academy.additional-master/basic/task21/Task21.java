package it_academy_additional.task21;

/**
 * Created by meks on 9/26/2016.
 */
public class Task21 {
    public static long measure1() {
        String firstString = "";
        long ft, fe;
        ft = System.nanoTime();
        for (int i = 0; i < 20; i++) {
            firstString += "Сравнить скорость выполнения";
        }
        fe = System.nanoTime();
        return fe - ft;
    }

    public static long measure2() {
        StringBuilder secondString = new StringBuilder();
        long st, en;
        st = System.nanoTime();
        for (int i = 0; i < 20; i++) {
            secondString.append("Сравнить скорость выполнения");
        }
        en = System.nanoTime();
        return en - st;
    }

    /**
     * Написать 2 цикла выполняющих многократное сложение строк,
     * один с помощью оператора сложения и String,
     * а другой с помощью StringBuilder и метода append.
     * Сравнить скорость выполнения
     */
    public static void main(String[] args) {
        System.out.println("JVM тут еще не скомпилировала - Загрузка в String " + String.format("%,12d", measure1()) + " ns");
        System.out.println("Второй вызов, на разогретой JVM - Загрузка в String " + String.format("%,12d", measure1()) + " ns");
        System.out.println("JVM тут еще не скомпилировала - Загрузка в билдер " + String.format("%,12d", measure2()) + " ns");
        System.out.println("Второй вызов, на разогретой JVM - Загрузка в билдер " + String.format("%,12d", measure2()) + " ns");


    }
}
