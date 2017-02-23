package workbook;

import java.util.ArrayList;
import java.util.List;

/*
 * Created by Sukora Stas.
 */
public class test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            names.add(String.valueOf(i));
        }
        System.out.println(names);
        for (int j = 0; j < names.size(); j++) {
            names.add(j, "Updated Name");
        }
        System.out.println(names);
    }
}
