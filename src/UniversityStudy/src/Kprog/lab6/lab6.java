package UniversityStudy.src.Kprog.lab6;

/**
 * Created by Sukora Stas.
 */
public class lab6 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }
}
