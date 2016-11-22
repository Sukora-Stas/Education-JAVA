package it_academy_additional.task27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by meks on 10/1/2016.
 */
public class Task27 {
    static ArrayList<Integer> generateMark(int a) {
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            marks.add((int) (Math.random() * 10 + 1));
        }
        return marks;
    }

    /**
     * Создать коллекцию, наполнить её случайными числами.
     * Удалить повторяющиеся числа
     */
    public static void main(String[] args) {

        ArrayList<Integer> allmarks = generateMark(10);
        for (Integer a : allmarks) {
            System.out.printf("%3d ", a);
        }
        System.out.println("");

        Set<Integer> set = new HashSet<Integer>(allmarks);
        allmarks.clear();
        allmarks.addAll(set);
        for (Integer a : allmarks) {
            System.out.printf("%3d ", a);
        }
        System.out.println("");
    }
}
