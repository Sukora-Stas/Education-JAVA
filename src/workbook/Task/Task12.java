package workbook.Task;

import java.text.DecimalFormat;

/**
 * Created by Sukora Stas on 14.10.2016.
 */
//Имеется целое число, следует вывести его в бухгалтерском формате. Т.е. начиная справа каждые три позиции отделяются пробелом.
public class Task12 {


    public static void main(String[] args) {
        int n =(int)(Math.random()*100000000);
        System.out.println("простоый вид "+n);
        System.out.print("бухгалтерский вид ");
        System.out.printf("%,d", n);
    }
}
