package workbook.Task;

/**
 * Created by Sukora Stas on 13.10.2016.
 */
//имеется целое число, это число -сумма денег в рублях. Вывести это число, добавив к нему слово "рублей" в правильном падеже.
public class Task5 {
    public static void main(String[] args) {
        int a = (int) Math.round(Math.random() * 100000);
        System.out.println("Число: " + a);
        //перевод в стринг
        String str = String.valueOf(a);
        int lenth = str.length() - 1;
        //последний символ строки
        char c = str.charAt(lenth);
        switch (c) {
            case '1':
                System.out.println(a + " рубль");
                break;
            case '2':
            case '3':
            case '4':
                System.out.println(a + " рубля");
                break;
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println(a + " рублей");
                break;

        }


        // System.out.println(lenth);


    }


}

