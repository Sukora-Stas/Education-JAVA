package Blinov.Section1.A;

import java.io.*;

/**
 * Created by Sukora Stas.
 */
//1.Создать класс Hello,который будет приветствовать любого пользователя,используя командную строку.
//2.Создать приложение,которое отображает в окне консоли аргументы командной строки метода main()в обратном порядке

public class Hello {
    public static void main(String[] args) {  /* байтовый поток ввода System.in передается конструктору потока    чтения при создании объекта класса InputStreamReader  */
        for (String str : args) System.out.printf("Aрг-> %s%n", str);

        InputStreamReader is = new InputStreamReader(System.in);  /* производится буферизация данных, исключающая необходимость  обращения к источнику данных при выполнении операции чтения */
        BufferedReader bis = new BufferedReader(is);
        try {
            System.out.println("Введите Ваше имя и нажмите <Enter>:");  /* чтение строки из буфера; метод readLine() требует обработки   возможной ошибки при вводе из консоли в блоке try */
            String name = bis.readLine();
            System.out.println("Привет, " + name);
        } catch (IOException e) {
            System.err.print("ошибка ввода " + e);
        }

        for (String str : args) System.out.printf("Aрг-> %s%n", str);
    }
}
