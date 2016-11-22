package workbook.Task;

/**
 * Created by Sukora Stas on 14.10.2016.
 */
//Имеется целое число, определить является ои это число простым, т.е. делится без остатка только на 1 и себя.
public class Task11 {
    public static void main(String[] args) {
        int n = (int)(Math.random()*1000);
        boolean isComposite = false;
        System.out.println(n);
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            System.out.println("число составное ");
        } else {
            System.out.println("число  простое ");
        }
    }
}
