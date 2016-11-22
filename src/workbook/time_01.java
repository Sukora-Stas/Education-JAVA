package workbook;

public class time_01 {
    public static void main(String[] args) {
        int s = 3004789;
        int sec, m, min, h, hour, day, d, week, w;
        sec = s % 60;               //остаток секунд
        m = (s - sec) / 60;         // количество минут
        min = m % 60;               //остаток минут
        h = (m - min) / 60;         //количесвто часов
        hour = h % 60;              //остаток часов
        d = (h - hour) / 24;        //количество дней
        day = d % 24;               //остаток дней
        w = (d - day) / 7;
        week = w % 7;
        System.out.println(week + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд");
    }
}
