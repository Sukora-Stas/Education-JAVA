package it_academy_additional.task28;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by meks on 10/1/2016.
 */
public class Task28 {
    static ArrayList<Integer> generateMark(int a) {
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            marks.add((int) (Math.random() * 10 + 1));
        }
        return marks;
    }

    static Integer searchMax(ArrayList<Integer> allmarks) {
        Iterator<Integer> it = allmarks.iterator();
        Integer maxmark = it.next();
        while (it.hasNext()) {
            Integer mark = it.next();
            if (maxmark >= mark) {
            } else
                maxmark = mark;
        }
        return maxmark;
    }

    /**
     * Создать список учеников с помощью ArrayList, заполнить случайными оценками
     * Найти самую высокую оценку с использованием итератора
     */
    public static void main(String[] args) {
        ArrayList<Integer> allmarks = generateMark(10);
        for (Integer a : allmarks) {
            System.out.printf("%3d ", a);
        }
        System.out.println("");

        Integer maxMark = searchMax(allmarks);
        System.out.println(maxMark);
    }
}
