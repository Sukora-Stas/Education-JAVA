package it_academy_additional.task24;

/**
 * Created by meks on 10/1/2016.
 */
public class Kettle extends SmallApp implements PlugIn {
    @Override
    void on() {
        super.on();
    }

    @Override
    void off() {
        super.off();
    }

    @Override
    public void plugIn() {
        System.out.println("Чайник включён в розетку");
    }
}
