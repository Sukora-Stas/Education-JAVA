package DevColibri.lesson.Object.devcat;

/**
 * Created by Sukora Stas.
 */
public class Cat {

    private int vozvrat;
    private String poroda;
    private String name;

    public Cat(int vozvrat, String poroda, String name) {
        this.vozvrat = vozvrat;
        this.poroda = poroda;
        this.name = name;
    }

    public int getVozvrat() {
        return vozvrat;
    }

    public void setVozvrat(int vozvrat) {
        this.vozvrat = vozvrat;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("May");
    }

    @Override
    public String toString() {
        return "Cat[name: " + name + ", Poroda: " + poroda + " - " + vozvrat + "]";
    }
}
