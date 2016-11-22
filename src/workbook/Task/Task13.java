package workbook.Task;

/**
 * Created by Sukora Stas on 14.10.2016.
 */
//решить задание на поиск простых исел с использованием break
public class Task13 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 1000);
        boolean isComposite = false;
        System.out.println(n);
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (!isComposite) {
            System.out.println("число  простое ");
        } else {
            System.out.println("число не  простое!!");
        }
    }
}

