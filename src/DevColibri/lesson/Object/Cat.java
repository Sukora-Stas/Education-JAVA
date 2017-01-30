package DevColibri.lesson.Object;

/**
 * Created by Sukora Stas.
 */
public class Cat {

    int vozvrat;
    String poroda;
    String name;


    @Override
    public String toString() {
        return "Cat[name: " + name + ", Poroda: " + poroda + " - " + vozvrat + "]";
    }
}
