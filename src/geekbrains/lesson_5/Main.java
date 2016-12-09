package geekbrains.lesson_5;

import java.util.Scanner;

/**
 * Created by Sukora Stas.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ваша задаач угадать число.");
        for (int i = 10; i <= 30; i += 10) playLevel(i);
        System.out.println("Вы выйграли!!!");
        scanner.close();
    }

    private static void playLevel(int range) {
        int number = (int) (Math.random() * range);
        System.out.println("Угадайте число от 0 до " + range);
        while (true) {
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
    }
}
