package workbook.Task;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Sukora Stas on 20.10.2016.
 */


/*
* Найти в строке не только запятые, но и другие знаки припения. Подсчитать общее их колличество
* */
public class Task18 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        char c;
        int sum = 0;
        String str = "Your time is limited, so don’t waste it living someone else’s life!";
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == ',' || c == '–' || c == ':' || c == ')' || c == '(' || c == ';' || c == '.' || c == '«' || c == '»' || c == '!' || c == '\'') {
                sum++;
            }
        }

        System.out.println("Колличество слов = " + sum);
        long timeSpent = System.currentTimeMillis();
        System.out.println("программа выполнялась " + (timeSpent - startTime) + " миллисекунд");
    }
}
