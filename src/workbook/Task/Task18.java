package workbook.Task;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Sukora Stas on 20.10.2016.
 */


/*
* Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
* учесть, что слова могут разделяться несколькими пробелами, в начале и конце
 * текста также могут быть пробелы, но могут и отсутствовать.
* */
public class Task18 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        char c;
        int sum = 0;
        String str = "Your time is limited, so don’t waste it living someone else’s life";
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == ' ' || c == ',') {
                sum++;
            }
        }

        System.out.println("Колличество слов = " + sum);
        long timeSpent = System.currentTimeMillis();
        System.out.println(timeSpent);

        System.out.println("программа выполнялась " + (timeSpent - startTime) + " миллисекунд");
    }
}
