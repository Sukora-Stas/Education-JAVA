package DevColibri.lesson.Object;

import DevColibri.lesson.Object.devcat.Cat;
import DevColibri.lesson.Object.devpeople.People;

/**
 * Created by Sukora Stas.
 */

public class Main {

    static Cat cat;
    static People people;

    public static void main(String[] args) {
        cat = new Cat(2, "Шпиц", "Лиза");

        people = new People("Стас", "Сукора", 19, cat);
        people.getCat().setName("Джордж");

        System.out.println(people);
        cat.say();
        people.getCat().say();
    }

}
