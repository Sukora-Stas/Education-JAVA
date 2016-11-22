package workbook.Task;

/**
 * Created by Sukora Stas on 14.10.2016.
 */
//Определить сумму элементов массива, расположеных между минимальным и максимальным значением.
public class Task15 {
    public static void main(String[] args) {
        //  System.out.println("список оценок");
        int[] marks = new int[20];
        for (int i = 0; i < 20; i++) {
            marks[i] = (int) (Math.round(Math.random() * 10));
            //     System.out.println("\nученик № " + i + " получил оценку " + marks[i]);
        }
        System.out.println();
//нахождение максимальной оценки и его индекса
        int index1 = 0;
        int index2 = 0;
        int maxMarks = marks[0];
        int minMarks = marks[0];
        System.out.print("все оценки ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(" " + marks[i]);
            if (maxMarks < marks[i]) {
                maxMarks = marks[i];
                index1 = i;
            }
            if (minMarks > marks[i]) {
                minMarks = marks[i];
                index2 = i;
            }
        }
        int sum = 0;
        if (index1 < index2) {
            for (int i = index1; i < index2 + 1; i++) {
                sum += marks[i];
            }
        } else {
            for (int i = index2; i < index1 + 1; i++) {
                sum += marks[i];
            }
        }
        System.out.println();
        System.out.println("максимальная оценка = " + maxMarks);
        System.out.println("минимальная оценка " + minMarks);
        System.out.println("индекс максимальной оценки " + index1);
        System.out.println("индекс минимальной оценки " + index2);
        System.out.println(sum);
    }
}
