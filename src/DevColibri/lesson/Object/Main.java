package DevColibri.lesson.Object;

/**
 * Created by Sukora Stas.
 */

public class Main {

    static Cat cat = new Cat();

    public static void main(String[] args) {
        cat.name = "Timon";
        cat.poroda = "Shpic";
        cat.vozvrat = 2;

        System.out.println(cat);
    }

}
