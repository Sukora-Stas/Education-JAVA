package DevColibri.lesson.Object;

/**
 * Created by Sukora Stas.
 */

public class Main {

    static Cat cat = new Cat();
    static People people = new People();

    public static void main(String[] args) {
        cat.name = "Timon";
        cat.poroda = "Shpic";
        cat.vozvrat = 2;


        people.name = "Stas";
        people.lastName = "Sukora";
        people.age = 19;
        people.cat = cat;

        System.out.println(people);
        cat.say();
    }

}
