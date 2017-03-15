package Blinov.Section1.A;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Sukora Stas.
 */
public class Info {
    public static void main(String[] args) {
        System.out.println("Sukora Stanislav");
        Calendar calendar = new GregorianCalendar();

        String str=calendar.getTime().toString();
        System.out.println("Задание получено -> "+str);
    }
}
