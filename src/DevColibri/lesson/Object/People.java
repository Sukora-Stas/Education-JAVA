package DevColibri.lesson.Object;

/**
 * Created by Sukora Stas.
 */
public class People {

    String name;
    String lastName;
    int age;

    Cat cat;

    @Override
    public String toString() {
        return "People[Имя: "+name+", Фамилия: "+lastName+" - "+age+"год(а), Есть кот: "+cat;
    }
}
