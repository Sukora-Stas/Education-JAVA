package workbook.Task;


/**
 * Created by Sukora Stas on 13.10.2016.
 */
//имеется прямоугольное отверстие размерами а и б, определить, можно ли его полностью закрыть круглой картинкой радиусом r.
public class Task4 {
    public static void main(String[] args) {
        int a = (int) Math.round(Math.random() * 10);
        int b = (int) Math.round(Math.random() * 10);
        System.out.println("Длинна А= " + a + "\n" + "Длинна B = " + b);
        System.out.println();
        //diagonal
        double d = Math.sqrt(Math.pow(b, 2) + Math.pow(a, 2));
        System.out.println("Диаметр прямоугольника " + d + "\n");
        for (int i = 0; i < 1000; i++) {
            double r = Math.random() * 10;
            System.out.println("Радиус[" + i + "]= " + r);
            if (r >= d) {
                System.out.println("Даннвя окружность перекрывает прямоугольник");
                break;
            }
        }


        //System.out.println(r);
    }
}
