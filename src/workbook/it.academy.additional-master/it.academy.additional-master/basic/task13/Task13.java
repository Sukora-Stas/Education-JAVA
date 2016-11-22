package it_academy_additional.task13;

/**
 * Created by meks on 9/24/2016.
 */
public class Task13 {
    /**
     * поиск простых чисел с использованием break
     */
    public static void main(String[] args) {
        int numb = (int) (Math.random() * 1000);
        //int numb =2;
        while (numb >= 0)
            if (numb == 2 || numb == 3 || numb == 5) {
                System.out.println("Число " + numb + " простое");
                break;
            } else if (numb % 2 == 0||numb % 3 == 0||numb % 5 == 0){
                System.out.println("Число " + numb + " не простое");
                break;
            }else {
                System.out.println("Число " + numb + " простое");
                break;
            }

    }

}


