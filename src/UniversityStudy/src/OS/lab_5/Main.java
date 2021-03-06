package UniversityStudy.src.OS.lab_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;


        /*Написать программу, выводящую на экран список запущенных
          процессов и потоков и их атрибуты (pid и др.) в виде таблицы.*/


/**
 * Created by Sukora Stas.
 */
public class Main {

    public static void main(String[] args) {
        try {

            Locale.setDefault(new Locale("en"));
            String line;

            //linux
            //process
//            Process process = Runtime.getRuntime().exec("ps -e");
//
//            //Thread
//            Process thread = Runtime.getRuntime().exec("ps -T");

            //Windows
            Process process = Runtime.getRuntime().exec(System.getenv("windir")
            +"\\system32\\"
            +"tasklist.exe");

            BufferedReader reader;
            reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            System.out.println("PROCESS:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("========================================");
            reader.close();

            /*reader = new BufferedReader(new InputStreamReader(thread.getInputStream()));
            System.out.println("THREAD:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
