package it_academy_additional.task14;

public class Task14 {
    /** Поиск максимальной оценки, вывести не саму оценку, а её номер */
    public static void main(String[] args) {
        int[] marks=new int[20];
        for (int i = 0; i <20 ; i++) {
            marks[i]=(int)(Math.random()*10+1);
            System.out.print(" "+marks[i]);
        }

        int maxMark = marks[0];
        for (int i = 1; i < 20; i++) {
            if (maxMark<marks[i])
                maxMark=marks[i];
        }
        System.out.println("\nМаксимальная оценка: "+maxMark);
        System.out.print("Под номером");
        for (int i = 0; i < 20; i++) {
            if(maxMark==(marks[i]))
                System.out.print(" "+(i+1)+" ");
        }


    }
}
