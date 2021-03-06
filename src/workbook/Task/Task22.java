package workbook.Task;

/**
 * Created by Sukora Stas on 20.10.2016.
 */
/*
* Создать класс и обьекты описывающие промежуток времени. Сам промежуток
* в классе должен задаваться тремя свойствами: секундами, минутами, часами.
* Сделать методы для получения полного количества секунд в обьекте, сравнения
* двух обьектов (метод должен работать аналогично compareTo в строках). Создать
* два конструктора: получающий общее количество секунд, и часы, минуты и секунды
* по отдельности. Сделать метод для вывоода данных. Прочее на ваше усмотрение.
* */
public class Task22 {
    private int s;
    private int m;
    private int h;
    private int fullSec;

    private void setTime(int h, int m, int s) {
        this.s = s;
        this.m = m;
        this.h = h;
    }

    private String getTime() {
        return "Hour: " + h + " Minute: " + m + " Second: " + s;
    }

    private String getSecond() {
        int sum = 0;

        sum += h * 60 * 60;
        sum += m * 60;
        sum += s;

        return "Second full = " + sum;
    }

    public int getFullSec() {
        fullSec = h * 360 + m * 60 + s;
        return fullSec;
    }

    private Task22(int fullSec1) {
        this.fullSec = fullSec1;
    }

    private Task22(int sec1, int min1, int hour1) {
        s = sec1;
        m = min1;
        h = hour1;

    }

    static int compareToo(int obj1, int obj2) {
        if (obj1 < obj2)
            return -1;
        else if (obj1 > obj2)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Task22 time = new Task22(10, 20, 10);

        time.setTime(10, 20, 50);

        System.out.println(time.getTime());

        System.out.println(time.getFullSec());

        Task22 time2 = new Task22(55322136);

        System.out.println(time2.getFullSec());

        int result = compareToo(time.getFullSec(), time2.getFullSec());

        System.out.println(result);

    }
}
