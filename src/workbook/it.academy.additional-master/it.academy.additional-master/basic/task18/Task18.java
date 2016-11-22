package it_academy_additional.task18;

/**
 * Created by meks on 9/25/2016.
 */
public class Task18 {
   /** Подсчитать все знаки препинания в строке */
    public static void main(String[] args) {
        int counter=0;
        char symbol;
        String str ="Если вас интересует мое мнение – я выскажусь: настоящая дружба " +
                "(именно дружба, а не шапочное знакомство или приятельские отношения) " +
                "проверяется в радости; умение разделить радость другого человека – этим " +
                "сегодня могут похвастаться немногие…очень немногие «друзья»!";
        for (int i = 0; i < str.length(); i++) {
            symbol=str.charAt(i);
            if (symbol==','||symbol=='–'||symbol==':'||symbol==')'||symbol=='('||symbol==';'||symbol=='.'||symbol=='«'||symbol=='»'||symbol=='!')
                counter++;
        }
        System.out.println("Колличество знаков препинания "+counter);
    }
}
