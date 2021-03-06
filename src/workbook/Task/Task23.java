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

    private int howMuchMoney() {
        return (m20 * 20) + (m50 * 50) + (m100 * 100);
    }

    private void addMoneyToBankomat(int a) {
        try {
            switch (a) {
                case 1:
                    System.out.println("Input amount money rating *20*: ");
                    System.out.println("Now bank have money amount *20$*=" + m20);
                    m20 += scanner.nextInt();
                    System.out.println("Now bank have money amount *20$*=" + m20);
                    break;
                case 2:
                    System.out.println("Input amount money rating *50*: ");
                    System.out.println("Now bank have money amount *50$*=" + m50);
                    m50 += scanner.nextInt();
                    System.out.println("Now bank have money amount *50$*=" + m50);
                    break;
                case 3:
                    System.out.println("Input amount money rating *100*: ");
                    System.out.println("Now bank have money amount *100$*=" + m100);
                    m100 += scanner.nextInt();
                    System.out.println("Now bank have money amount *100$*=" + m100);
                    break;
                default:
                    System.out.println("ERROR!");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Fuck you niga, you stupid. EROR NAXYU");
        }
    }

    private void getMoney(int money) {
        int amount, sum, banknot;
        if (giveMyMoneyNiga(money)) {
            System.out.println("You get you'r money!");
            sum = howMuchMoney();

            amount = money / 100;
            if (m100 >= amount) {
                if (amount > 0) {
                    m100 -= amount;
                    System.out.println("Banknot 100$ - " + amount + " st");
                }
            } else {
                money -= m100 * 100;


                amount = (money % 100) / 50;
                if (amount > 0) {
                    m50 -= amount;
                    System.out.println("Banknot 50$ - " + amount + " st");


                    amount = ((money % 100) % 50) / 20;
                    if (amount > 0) {
                        m20 -= amount;
                        System.out.println("Banknot 20$ - " + amount + " st");
                    }
                }
            }
        } else System.out.println("Don't have money. Fuck you!");
    }

    public void menu(int a) {
        switch (a) {
            case 1:
                System.out.println("Select rating money of you need input to bankomat");
                System.out.println("1:20$");
                System.out.println("2:50$");
                System.out.println("3:100$");
                addMoneyToBankomat(scanner.nextInt());
                break;
            case 2:
                System.out.println("how much do you need money?");
                getMoney(scanner.nextInt());
                break;
            case 3:
                System.out.println(howMuchMoney());
                break;
            default:
                System.out.println("Sosi pisos!");
                break;
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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Task23 bankomat = new Task23(30, 40, 10);

        System.out.printf("%-15s", "Menu:\n");
        System.out.println();
        System.out.printf("%-5d%-15s", 1, "Add money:\n");
        System.out.printf("%-5d%-15s", 2, "Get money:\n");
        System.out.printf("%-5d%-15s", 3, "How much money:\n");
        bankomat.menu(scanner.nextInt());


        System.out.println();
    }


}
