package UniversityStudy.src.lab_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

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
            Process process = Runtime.getRuntime().exec("ps -e");

            //Thread
            Process thread = Runtime.getRuntime().exec("ps -T");

            //Windows
            /*Process process1 = Runtime.getRuntime().exec(System.getenv("windir")
            +"\\system32\\"
            +"tasklist.exe");*/

            BufferedReader reader;
            reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            System.out.println("PROCESS:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("========================================");
            reader.close();

            reader = new BufferedReader(new InputStreamReader(thread.getInputStream()));
            System.out.println("THREAD:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
