package it_academy_additional.task2;

/**
 * Created by meks on 9/7/2016.
 */
public class Task2 {
    public static void main(String[] args) {
        int sec, m, min, h, day, week, hour, s = 3700000;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour=h%24;
        day = (h-hour)%(24*7);
        week = (h - day)/(24*7);
        System.out.println(week + " недель " + day + " дней " +hour+" часов " + min + " минут " + sec + " секунт ");

    }
}
