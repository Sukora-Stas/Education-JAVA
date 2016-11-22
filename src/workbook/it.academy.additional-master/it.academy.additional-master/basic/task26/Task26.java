package it_academy_additional.task26;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by meks on 10/1/2016.
 */
public class Task26 {
    static ArrayList<Integer> generateMarks(int length) {
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            marks.add((int) (Math.random() * 10 + 1));
        }
        return marks;
    }

    static ArrayList<Integer> deleteBadMarks(ArrayList<Integer> allmark) {
        Iterator<Integer> it = allmark.iterator();
        while (it.hasNext()) {
            Integer mark = it.next();
            if (mark < 4) {
                it.remove();
            }
        }
        allmark.trimToSize();
        return allmark;
    }

    /**
     * Создать список учеников с помощью ArrayList,
     * заполнить случайными оценками.
     * Удалить неудовлетворительные оценки из списка
     */
    public static void main(String[] args) {

        ArrayList<Integer> allMarks = generateMarks(10);
        for (Integer all : allMarks) {
            System.out.printf("%3d ", all);
        }
        System.out.println("");

        ArrayList<Integer> goodMarks = deleteBadMarks(allMarks);
        for (Integer all : goodMarks) {
            System.out.printf("%3d ", all);
        }
        System.out.println("");
    }
}
