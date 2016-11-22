package it_academy_additional.task24;

/**
 * Created by meks on 10/1/2016.
 */

public class SmallApp extends Appliances {

    @Override
    void on() {
        System.out.println("Включение маленькой бытовой техники");
    }

    @Override
    void off() {
        System.out.println("Выключение маленькой бытовой техники");
    }
}
