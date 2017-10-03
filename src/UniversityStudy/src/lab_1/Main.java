package UniversityStudy.src.lab_1;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello man! :)");
        System.out.println("Please, input you'r file name:");
        String fileName = "/home/stas/680961/SukoraSI/" + reader.readLine();
        System.out.print("Input N argument:");
        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error. Correct you'r argument!");
            System.exit(0);
        }


        try {
            int i = 0;
            List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
            for (String line : lines) {
                if (n == 0) {
                    System.out.println(line);
                } else {
                    if (n == i) break;
                    System.out.println(line);
                    i++;
                }

            }

        } catch (NoSuchFileException e) {

            System.out.println("No Such File!");

        } catch (FileNotFoundException e) {

            System.out.println("File not found!");

        }

    }
}
