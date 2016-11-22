package workbook.Task;

/**
 * Created by Sukora Stas on 20.10.2016.
 */
//Создать массив, заполнить его случайнцми элементами, распечатать, перевернуть, и снова распечатать
public class Task16 {
    public static void main(String[] args) {
        System.out.println();
        int m[][] = new int[5][5];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.round(Math.random() * 9));
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        //это создавая до массив
        System.out.println();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();


    }
}
