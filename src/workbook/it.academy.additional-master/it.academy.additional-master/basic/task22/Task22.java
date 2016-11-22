package it_academy_additional.task22;


/**
 * Created by meks on 9/27/2016.
 */
public class Task22{
    private int sec, min, hour, fullSec;

    public int getFullSec() {
        fullSec = hour * 360 + min * 60 + sec;
        return fullSec;
    }

    public int getFullSec2() {
        return fullSec;
    }

    public Task22(int fullSec1) {
        fullSec = fullSec1;
    }

    public Task22(int sec1, int min1, int hour1) {
        sec = sec1;
        min = min1;
        hour = hour1;

    }

    static int newCompareTo(int a, int b){
        if (a<b)
            return -1;
        else if (a>b)
            return 1;
        else
            return 0;
    }

    private static void print(Object v) {
        System.out.println(v);
    }

    /**
     * Класс и объекты описывают время
     * три свойства в классе: секунды, минуты, часы
     * Сделать методы для получения полного количества секунд в объекте,
     * сравнения двух объектов(метод должен работать аналогично compareTo в строках)
     * Создать 2 конструктора: получающий общее кол-во секунд, и часы, минуты и секунды по отдельности
     * Сделать метод для вывода данных
     */
    public static void main(String[] args) {

        Task22 obj1 = new Task22(4, 67, 100);
        Task22 obj2 = new Task22(3434);
        System.out.println("dsaf");
        print(" Всего секунд " + obj1.getFullSec() + " в 1-ом объекте");
        print(" Всего секунд " + obj2.getFullSec2() + " во 2-ом объекте");
        int result = newCompareTo(obj1.getFullSec(),obj2.getFullSec2());
        System.out.println(result);
    }
}

