package it_academy_additional.task24;

/**
 * Created by meks on 10/1/2016.
 */

public class BigApp extends Appliances {

    @Override
    void on() {
        System.out.println("Включение крупной бытовой техники");
    }

    @Override
    void off() {
        System.out.println("Выключение крупной бытовой техники");
    }
}
