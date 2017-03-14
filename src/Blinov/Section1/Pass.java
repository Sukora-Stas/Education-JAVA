package Blinov.Section1;

import java.util.Scanner;

/**
 * Created by Sukora Stas.
 */
//4. Создать приложение для ввода пароля из командной строки и сравнения его со строкой-образцом.
public class Pass {
    static class UserView {
        public static void welcome(User obj) {
            System.out.printf("Привет! Введен код: %d, пароль: %s", obj.getNumericCode(), obj.getPassword());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        User user = new User();
        user.numericCode = 71;//некорректно - прямой доступ   // user.password = null; // поле недоступно
        user.setPassword("pass"); //корректно
        UserView.welcome(user);

        String test = "test";

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        if (str.equals(test)) {
            System.out.println("Всё верно");
        } else {
            System.out.println("Пароль не верный");
        }

    }
}

