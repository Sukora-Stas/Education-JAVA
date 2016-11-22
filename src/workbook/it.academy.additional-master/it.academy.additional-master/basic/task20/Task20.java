package it_academy_additional.task20;

/**
 * Created by meks on 9/26/2016.
 */
public class Task20 {
    /** Вывести текст, составленный из последних букв всех слов */
    public static void main(String[] args) {
        String str = " Если вас интересует мое мнение - я выскажусь: настоящая  дружба " +
                "(именно дружба, а не  шапочное знакомство  или приятельские отношения) " +
                "проверяется  в радости; умение  разделить радость другого человека - этим " +
                "сегодня могут  похвастаться немногие очень  немногие друзья! ";
        str = str.replaceAll("[()!.,:;-]","");

        String word ="";
        String[] words = str.split(" ");
        StringBuilder newSentence = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            word+=words[i];
            //for (word:words)
            if (words[i] != null && !"".equals(words[i])) {
                newSentence.append(word.charAt(word.length()-1));
            }
        }
        System.out.println(newSentence);
    }
}









