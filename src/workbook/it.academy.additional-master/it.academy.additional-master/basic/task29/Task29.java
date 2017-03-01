package it_academy_additional.task29;

import java.util.HashMap;

/**
 * Created by meks on 10/1/2016.
 */
public class Task29 {

    static HashMap<String, Integer> checkText() {
        HashMap<String, Integer> wordsInHashMap = new HashMap<>();
        String[] words = task29.Text.text.split("[^a-zA-Z]+");
        for (int i = 0; i < words.length; i++) {
            if (!wordsInHashMap.containsKey(words[i])) {
                wordsInHashMap.put(words[i], 1);
            } else {
                wordsInHashMap.replace(words[i], wordsInHashMap.get(words[i]) + 1);
            }
        }
        return wordsInHashMap;
    }
    /** Имеется текст.
     * Составить для него частотный словарь */
    public static void main(String[] args) {
        HashMap<String, Integer> words = checkText();
        for (HashMap.Entry<String,Integer> i: words.entrySet()){
            System.out.println(i.getKey() + "    " + i.getValue() + " раз(а)");
        }
        System.out.println();
    }
}
