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

    public void setTime(int h, int m, int s) {
        this.s = s;
        this.m = m;
        this.h = h;
    }

    public String getTime() {
        return "Hour: " + h + " Minute: " + m + " Second: " + s;
    }


    public static void main(String[] args) {
        Task22 time = new Task22();
        time.setTime(10, 20, 50);
        System.out.println(time.getTime());
    }
}
