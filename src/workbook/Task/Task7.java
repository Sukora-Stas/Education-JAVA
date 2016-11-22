package workbook.Task;

/**
 * Created by Sukora Stas on 13.10.2016.
 */
//Имеются 2 дома размерами а на в и с на d. Имеется участок размерами e на f. Проверить помещаются ли эти дома на данном участке.
// Стороны домов - параллейны сторонам участка, в остальном размещение может быть любым
public class Task7 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println();
            System.out.println("Попытка № " + i);
            System.out.println("----------------------");

            int a = (int) Math.round(Math.random() * 10 + 1);
            int b = (int) Math.round(Math.random() * 10 + 1);
            System.out.println("Длинна a= " + a + "\n" + "Длинна b = " + b);
            System.out.println();

            int c = (int) Math.round(Math.random() * 10 + 1);
            int d = (int) Math.round(Math.random() * 10);
            System.out.println("Длинна c= " + c + "\n" + "Длинна d = " + d);
            System.out.println();

            int e = (int) Math.round(Math.random() * 20 + 1);
            int f = (int) Math.round(Math.random() * 20 + 1);
            System.out.println("Длинна e= " + e + "\n" + "Длинна f = " + f);
            System.out.println("----------------------");

            if (((a + c) <= e) && (b <= f) || ((a + c) <= e) && (d <= f)) {
                if (((a + c) <= e) && (b <= f))
                    System.out.println((a + c) + " Меньше чем " + e + " и " + b + " меньше " + f);
                if (((a + c) <= e) && (d <= f))
                    System.out.println((a + c) + " Меньше чем " + e + " и " + d + " меньше " + f);
                System.out.println("Дома поместились горизонтально");
                break;
            } else if (((b + d) <= f) && (a <= e) || ((b + d) <= f) && (c <= e)) {
                if (((b + d) <= f) && (a <= e))
                    System.out.println((b + d) + " Меньше чем " + f + " и " + a + " меньше " + e);
                if (((b + d) <= f) && (c <= e))
                    System.out.println((b + d) + " Меньше чем " + f + " и " + c + " меньше " + e);
                System.out.println("Дома поместились вертикально");
                break;
            }

        }

    }
}
