package DevColibri.lesson.Object.devcat;

import DevColibri.lesson.Object.devpeople.People;

/**
 * Created by Sukora Stas.
 */
public class SportMan extends People {

    private String typeSport;

    @Override
    public String toString() {
        return "SportMan{" +
                "typeSport='" + typeSport + '\'' +
                '}';
    }

    public SportMan(String name, String lastName, int age, Cat cat) {
        super(name, lastName, age, cat);

    }

    public String getTypeSport() {
        return typeSport;
    }

    public void setTypeSport(String typeSport) {
        this.typeSport = typeSport;
    }

}
