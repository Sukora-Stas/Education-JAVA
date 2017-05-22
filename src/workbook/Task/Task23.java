package workbook.Task;

import java.util.Scanner;

/**
 * Created by Sukora Stas on 20.10.2016.
 */
public class Task23 {
    private int m20, m50, m100;
    private Scanner scanner = new Scanner(System.in);

    public Task23() {

    }

    public Task23(int m20, int m50, int m100) {
        this.m20 = m20;
        this.m50 = m50;
        this.m100 = m100;
    }

    public int getM20() {
        return m20;
    }

    public void setM20(int m20) {
        this.m20 = m20;
    }

    public int getM50() {
        return m50;
    }

    public void setM50(int m50) {
        this.m50 = m50;
    }

    public int getM100() {
        return m100;
    }

    public void setM100(int m100) {
        this.m100 = m100;
    }

    private boolean giveMyMoneyNiga(int money) {
        return (m20 * 20) + (m50 * 50) + (m100 * 100) >= money;
    }

    private void addMoneyToBankomat(int a) {
        try {

            switch (a) {
                case 1:
                    System.out.println("Input amount money rating *20*: ");
                    m20 += scanner.nextInt();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Fuck you niga, you stupid. EROR NAXYU");
        }
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
    public void menu(int a) {
        switch (a) {
            System.out.println("how much do you need money&");

            case 1:
                addMoneyToBankomat();
                break;


            default:
                System.out.println("Sosi pisos!");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Task23 bankomat = new Task23(30, 40, 50);

        System.out.printf("%-15s", "Menu:");
        System.out.println();
        System.out.printf("%-5d%-15s", 1, "Add money:");

        bankomat.menu(scanner.nextInt());


        System.out.println();

//        boolean t = bankomat.giveMyMoneyNiga(10000);
//        System.out.println(t);

    }


}
