package DevColibri.lesson.Object;

/**
 * Created by Sukora Stas.
 */
public class Cat {

    int vozvrat;
    String poroda;
    String name;

    void say() {
        System.out.println("May");
    }

    @Override
    public String toString() {
        return "Cat[name: " + name + ", Poroda: " + poroda + " - " + vozvrat + "]";
    }
}
