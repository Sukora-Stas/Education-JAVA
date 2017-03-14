package Blinov.Section1;

/**
 * Created by Sukora Stas.
 */
//5. Создать программу ввода целых чисел как аргументов командной строки, подсчета их суммы (произведения) и вывода результата на консоль.
public class Arifmetika {
    public static void main(String[] args) {
        int s=0, p=1;
        for(int i=0; i<args.length; i++)
        {
            int atata=Integer.parseInt(args[i]);
            s=s + atata;
            p=p * atata;
        }
        System.out.println("SUUMA = " + s);
        System.out.println("PROIZVEDENIE = "+ p);
    }
}
