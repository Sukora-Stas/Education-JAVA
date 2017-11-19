package UniversityStudy.src.Kprog.lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sukora Stas.
 */
/*
 * «Карточка для статьи» с методами, возвращающими кроме имени автора,
 * статью и ссылку на карточку для издания, в котором статья опубликована.
 * Реализовать класс «Каталог», с производными «Тематический каталог», «Алфавитный каталог» с методами,
 * реализующими поиск по шифру или автору (названию).
 */

public class lab3 {
    public static void main(String[] args) throws IOException {
        List<Card> list = new LinkedList<>();
        Card card;
        for (int i = 0; i < 15; i++) {
            card = new Card();
            card.setNameAuthor("Author" + i);
            card.setArticle("Article" + i);
            card.setUrl("url" + i);
            list.add(card);
        }

        System.out.println("Input your sort class");
        System.out.println("1: sort by code");
        System.out.println("2: sort by author");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());

        switch (a) {
            case 1:
                for (Card card1 : list) {
                    System.out.println(card1.getArticle() + " " + card1.getNameAuthor() + " " + card1.getUrl());
                }
                break;
            case 2:
                for (Card card1 : list) {
                    System.out.println(card1.getNameAuthor() + " " + card1.getArticle() + " " + card1.getUrl());
                }
                break;
        }


    }
}
