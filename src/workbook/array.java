package workbook;

public class array {
    public static void main(String[] args) {
        System.out.println("список оценок");
        int[] marks = new int[20];
        for (int i = 0; i < 20; i++) {
            marks[i] = (int) (Math.round(Math.random() * 10));
            System.out.println("\nученик № " + i + " получил оценку " + marks[i]);
        }
        System.out.println();


        int maxMarks = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (maxMarks < marks[i]) {
                maxMarks = marks[i];
            }
        }
        System.out.println("максимальная оценка = " + maxMarks);

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] <= 3) {
                System.out.println("\nУченик № " + i + " имеет неудовлетварительную оценку " + marks[i]);
            }
        }

        //big array
        System.out.println();
        int m[][] = new int[5][5];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int)(Math.round(Math.random()*9));
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        //System.out.println(m[i][j]);
    }
}
