package UniversityStudy.src.Kprog.lab4;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Sukora Stas.
 */
/*
* Напишите шаблон класса для работы с очередью.
 * Определите несколько очередей разных типов и поработайте с их данными.
* */
public class lab4 {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        for (int i = 0; i < 15; i++) {
            queue.add("queue " + i);
        }
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        queue.remove();
        System.out.println(queue);

    }
}
