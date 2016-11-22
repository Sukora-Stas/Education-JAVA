package it_academy_additional.task24;

/**
 * Created by meks on 10/1/2016.
 */
public class Refrigerator extends BigApp implements PlugIn{
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
        System.out.println("Холодильник включён в розетку");
    }
}
