package UniversityStudy.src.Kprog.lab5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sukora Stas.
 */
/*
* Создайте список целых чисел.
 * Создайте два итератора: один для продвижения в прямом направлении, другой для продвижения в обратном направлении.
 * Используйте их для переворачивания содержимого списка.
* */
public class lab5 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }

        Iterator<Integer> iterable = list.iterator();
        while (iterable.hasNext()) {
            System.out.println(iterable.next());
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }
}
