package workbook.Task;

/**
 * Created by Sukora Stas on 14.10.2016.
 */
//в задаче на поиск максимальной оценки, вывести не саму оценку, а её номер.
public class Task14 {
    public static void main(String[] args) {
      //  System.out.println("список оценок");
        int[] marks = new int[20];
        for (int i = 0; i < 20; i++) {
            marks[i] = (int) (Math.round(Math.random() * 10));
       //     System.out.println("\nученик № " + i + " получил оценку " + marks[i]);
        }
        System.out.println();
//нахождение максимальной оценки и его индекса
        int index = 0;
        int maxMarks = marks[0];
        System.out.print("все оценки ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(" " + marks[i]);
            if (maxMarks < marks[i]) {
                maxMarks = marks[i];
                index = i;
            }
        }
        System.out.println("максимальная оценка = " + maxMarks);
        System.out.println("индекс максимальной оценки " + index);
    }
}
