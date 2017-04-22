package someEducation;

import java.nio.charset.Charset;
import java.util.Scanner;

/**
 * Created by Sukora Stas.
 */
public class myTattoo {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(toBinary(str));

    }

    public static String toBinary(String text) {
        int value = 0;
        StringBuilder sb = new StringBuilder();

        for (char character : text.toCharArray()) {
            value++;
            sb.append(Integer.toBinaryString(character) + "\n");
            if (0 == (value % 4)) sb.append("\n");
        }

        return sb.toString();

    }
}

