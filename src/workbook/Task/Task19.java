package workbook.Task;

/**
 * Created by Sukora Stas on 20.10.2016.
 */
/*
* имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
 * учесть, что слова могут ращделяться несколькими пробелами, в начале и конце
 * текста также могут быть пробелы, но могут и отсутствовать
* */
public class Task19 {
    public static void main(String[] args) {
        String str = "Your time is limited, so don’t waste it living someone else’s life!";
        str = str.trim();
        System.out.println(str);
        String[] words = str.split("\\s");
        int wordCount = 0;
        for (int i = 0; i < words.length; ++i) {
            if (words[i] != null && !"".equals(words[i]) && !"-".equals(words[i])) {
                System.out.print(" " + words[i] + "+");
                wordCount++;
            }
        }
        System.out.println("\n" + wordCount);
    }
}
