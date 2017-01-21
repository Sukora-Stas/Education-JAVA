package DevColibri.lesson;

/**
 * Created by Sukora Stas.
 */
public class Variables {
    static byte b = 5;
    static short sh = 8;
    static int it = 99;
    static long l = 789;

    static float fl = 2.6f;
    static double db = 2.6;

    static boolean bool = true; //or false

    static String str = "string";

    static char c = 'd';

    static final int CONST = 55;

    static int a1 = 2;
    static double b1 = 4.9;
    static char c1 = 100;

    public static void main(String[] args) {

        int c = (int) b1;
        double b2 = a1;
        System.out.println(c);
        System.out.println(b2);

        int v = c1;

        System.out.println(c1);


        System.out.println(CONST);
        System.out.println("byte: " + b);
        System.out.println("short: " + sh);
        System.out.println("int: " + it);
        System.out.println("long: " + l);
        System.out.println("float: " + fl);
        System.out.println("double: " + db);
        System.out.println("boolean: " + bool + " //or false");

        System.out.println(str);
        System.out.println(c);
    }
}
