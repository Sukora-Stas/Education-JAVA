package UniversityStudy.src.Kprog;

/**
 * Created by Sukora Stas.
 */

/*
*  Реализовать класс String для работы со строками символов.
 *  Перегрузить операторы !(пуст ли String), ()(int,int) – возвращение подстроки, [].
  *  Предоставить конструктор копирования. Определить friend функции для операций ввода-вывода в поток.
*  */
public class lab2 {
    public static void main(String[] args) {
        String string = "dgafgafg \n" +
                "gsfgfsdgafgaf \n" +
                "sdfasfdgbvafdb \n" +
                "grgafgvdfab \n";

        System.out.println(string.indexOf(string,10));
    }
}
