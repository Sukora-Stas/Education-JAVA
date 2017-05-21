package workbook.Task;

/**
 * Created by Sukora Stas on 20.10.2016.
 */

/*Напишите два цикла выполняющих многократное сложение строк, один
* с помощью оператора сложения и String, а другой с помощью StringBuilder и метода append.
* Сравните скорость их выполнения.*/
public class Task21 {

    public static long stringPlus() {
        String firstStr = "";
        Long fs, fe;
        fs = System.nanoTime();
        for (int i = 0; i <= 200; i++) {
            firstStr += "Напишите два цикла выполня";
        }
        fe = System.nanoTime();
        return fe - fs;
    }

    public static long strindBild() {
        StringBuilder secondStr = new StringBuilder();
        long ss, se;
        ss = System.nanoTime();
        for (int i = 0; i <= 200; i++) {
            secondStr.append("Напишите два цик");
        }
        se = System.nanoTime();
        return se - ss;
    }

    public static void main(String[] args) {
        System.out.println("Сложение String "+String.format("%,12d",stringPlus())+"ns");
        System.out.println("Сложение String "+String.format("%,12d",stringPlus())+"ns");
        System.out.println("Сложение String "+String.format("%,12d",stringPlus())+"ns");

        System.out.println("StringBuilder append "+String.format("%,12d",strindBild())+"ns");
        System.out.println("StringBuilder append "+String.format("%,12d",strindBild())+"ns");
        System.out.println("StringBuilder append "+String.format("%,12d",strindBild())+"ns");
    }

//    public static long measure1() {
//        String firstString = "";
//        long ft, fe;
//        ft = System.nanoTime();
//        for (int i = 0; i < 20; i++) {
//            firstString += "Сравнить скорость выполнения";
//        }
//        fe = System.nanoTime();
//        return fe - ft;
//    }
//
//    public static long measure2() {
//        StringBuilder secondString = new StringBuilder();
//        long st, en;
//        st = System.nanoTime();
//        for (int i = 0; i < 20; i++) {
//            secondString.append("Сравнить скорость выполнения");
//        }
//        en = System.nanoTime();
//        return en - st;
//    }
//    public static void main(String[] args) {
//
//        long startTime = System.currentTimeMillis();
//        measure1();
//        long timeSpent = System.currentTimeMillis();
//        System.out.println("сложение заняла " + (timeSpent - startTime) + " миллисекунд");
//        System.out.println();
//        startTime = System.currentTimeMillis();
//        measure1();
//        timeSpent = System.currentTimeMillis();
//        System.out.println("Операция append заняла " + (timeSpent - startTime) + " миллисекунд");
//
//
//        System.out.println("JVM тут еще не скомпилировала - Загрузка в String " + String.format("%,12d", measure1()) + " ns");
//        System.out.println("Второй вызов, на разогретой JVM - Загрузка в String " + String.format("%,12d", measure1()) + " ns");
//
//        System.out.println("JVM тут еще не скомпилировала - Загрузка в билдер " + String.format("%,12d", measure2()) + " ns");
//        System.out.println("Второй вызов, на разогретой JVM - Загрузка в билдер " + String.format("%,12d", measure2()) + " ns");
//
//
//    }
}
