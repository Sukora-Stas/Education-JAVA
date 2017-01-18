package DevColibri.someLesson.MD5;

import java.util.Scanner;

/**
 * Created by Sukora Stas.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String str = scanner.nextLine();
        System.out.println("Custom MD5:");
        System.out.println(MD5Util.md5Custom(str));
//        System.out.println("Apache MD5:");
//        System.out.println(MD5Util.md5Apache(st));
    }
}
