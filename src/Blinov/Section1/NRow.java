package Blinov.Section1;

/**
 * Created by Sukora Stas.
 */
//3. Создать приложение, выводящее n строк с переходом и без перехода на новую строку
public class NRow {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10 + 1);
        System.out.println("Колличество строк: " + n);
        for (int i = 0; i <= n; i++) {
            System.out.println("с переходом");
        }
        for (int i = 0; i <= n; i++) {
            System.out.print("без перехода");
        }
    }
}
