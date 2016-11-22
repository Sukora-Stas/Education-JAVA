package it_academy_additional.task23;

import java.util.Scanner;

/**
 * Created by meks on 9/29/2016.
 */
public class Task23 {
    private int m20, m50, m100;

    public void set20(int ten) {
        this.m20 -= ten;
    }

    public void set50(int fif) {
        this.m50 -= fif;
    }

    public void set100(int hund) {
        this.m100 -= hund;
    }

    public Task23(int ten1, int fif1, int hund1) {
        m20 = ten1;
        m50 = fif1;
        m100 = hund1;
    }

    public int get20() {
        return m20 * 20;
    }

    public int get50() {
        return m50 * 50;
    }

    public int get100() {
        return m100 * 100;
    }

    public boolean giveMyMoney(int a) {
        if ((m20 * 20 + m50 * 50 + m100 * 100) >= a) {
            return true;
        } else
            return false;
    }

    /**
     * Создать класс и объекты описывающие Банкомат. Набор купюр находящихся
     * в банкомате должен задаваться тремя свойствами: количеством купюр номиналом
     * 20 50 100.
     * Сделать методы для добавления денег в банкомат.
     * Сделать функцию снимающую деньги.
     * На вход передается сумма денег.
     * На выход - булевское значение(удалась ли операция?)
     * При снятии денег функция должна распечатывать каким кол-вом купюр
     * какого номинала выдаётся сумма.
     * Создать конструктор с тремя параметрами - кол-вом купюр
     */
    public static void main(String[] args) {
        Task23 bank = new Task23(20, 30, 40);
        /**
         * Заливаем деньги
         */
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите сумму которую необходимо положить");
            System.out.println("Введите количество купюр номиналом 20");
            int m20 = scanner.nextInt();
            bank.set20(m20);
            System.out.println("Введите количество купюр номиналом 50");
            int m50 = scanner.nextInt();
            bank.set50(m50);
            System.out.println("Введите количество купюр номиналом 100");
            int m100 = scanner.nextInt();
            bank.set100(m100);
        } catch (Exception e) {
            System.out.println("Неудачно!");
        }

        System.out.println("Всего наличных " + (bank.get20() + bank.get50() + bank.get100()));

        int money = 170000;
        /** Реализовать вычитания денег при снятии */
        if (bank.giveMyMoney(money)) {
            if (money / 100 > 0) {
                bank.set100(money / 100);
                if ((money % 100) / 50 > 0) {
                    bank.set50((money % 100) / 50);
                    if (((money % 100) % 50) / 20 > 0) {
                        bank.set20(((money % 100) % 50) / 20);
                    }
                }
            }
        } else {
            System.out.println("Недостаточно денег в банкомате");
        }


        System.out.println("Всего наличных " + (bank.get20() + bank.get50() + bank.get100()));

    }
}
