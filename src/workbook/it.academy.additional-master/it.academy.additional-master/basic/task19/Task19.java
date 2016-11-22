package it_academy_additional.task19;

import java.util.Scanner;

/**
 * Created by meks on 9/25/2016.
 */
public class Task19 {
    /**
     * Подсчитать кол-во слов в тексте. Желательно учесть,
     * что слова могут разделятся несколькими пробелами,
     * в начале и конце текста также могут быть пробелы,
     * но могут и отсутствовать
     */
    public static void main(String[] args) {
        String str = " Если вас интересует мое мнение - я выскажусь: настоящая  дружба " +
                "(именно дружба, а не  шапочное знакомство  или приятельские отношения) " +
                "проверяется  в радости; умение  разделить радость другого человека - этим " +
                "сегодня могут  похвастаться немногие… очень  немногие друзья! ";
        str.trim();
        String[] words = str.split("\\s");
        int wordCount = 0;
        for (int i = 0; i < words.length; ++i) {
            if (words[i] != null && !"".equals(words[i]) && !"-".equals(words[i])) {
                System.out.print(" " + words[i] + "+");
                wordCount++;
            }
        }
        System.out.println("\n" + wordCount);

    }
}
