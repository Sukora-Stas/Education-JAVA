package workbook.Task;



import java.util.Calendar;
import java.util.Date;

/**
 * Created by Sukora Stas on 13.10.2016.
 */
//Имеются три числа -день, месяц, год. Вывести в виде трёх чисел дату следущего дня
public class Task6 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int monthe=calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        char point = '.';
        System.out.println(day+"."+monthe+"."+year);
        System.out.println(day+1+"."+monthe+"."+year);
    }
}
