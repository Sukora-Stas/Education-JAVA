package it_academy_additional.task24;

/**
 * Created by meks on 10/1/2016.
 */
public class Task24 {
    /**
     * Создать иерархию классов, описывающих бытовую технику.
     * Создать несколько объектов описанных классов, часть из них включить в розетку
     * Иерархия минимум 3 уровня
     */
    public static void main(String[] args) {
        PlugIn holod = new Refrigerator();
        holod.plugIn();
        PlugIn chai = new Kettle();
        chai.plugIn();
    }
}
