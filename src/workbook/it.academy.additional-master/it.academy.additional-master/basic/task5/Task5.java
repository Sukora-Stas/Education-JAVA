package it_academy_additional.task5;

import java.util.Scanner;

/**
 * Created by meks on 9/7/2016.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        Integer a = scanner.nextInt();
        int pad;
        pad =a%10;
        if  (a==11||a==12||a==13||a==14)
            System.out.println(a +" рублeй");
        else if (a<=2 & a>=4)
            System.out.println(a +" рубля");
        else if (a<=5 & a>=9)
            System.out.println(a +" рублeй");
        else if (pad==0)
            System.out.println(a +" рублeй");
        else if  (a==11||a==12||a==13||a==14)
        System.out.println(a +" рублeй");
        else if(pad==1)
            System.out.println(a +" рубль");
    }
}