package Blinov.Section1;

import java.io.*;

/**
 * Created by Sukora Stas.
 */
public class Hello {
    public static void main(String[] args) {  /* байтовый поток ввода System.in передается конструктору потока    чтения при создании объекта класса InputStreamReader  */
        InputStreamReader is = new InputStreamReader(System.in);  /* производится буферизация данных, исключающая необходимость  обращения к источнику данных при выполнении операции чтения */
        BufferedReader bis = new BufferedReader(is);
        try {
            System.out.println("Введите Ваше имя и нажмите <Enter>:");  /* чтение строки из буфера; метод readLine() требует обработки   возможной ошибки при вводе из консоли в блоке try */
            String name = bis.readLine();
            System.out.println("Привет, " + name);
        } catch (IOException e) {
            System.err.print("ошибка ввода " + e);
        }
    }
}
