package obiektowe.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//SCANNER - ODCZYT Z PLIKU
public class ReadingTextFiles {
    public static void main(String[] args) {
        //scanner jak dostanie String to skanuje ten String, nie traktuje go jako ścieżki do pliku tak jak PrintWritter
        File file = new File("car.txt"); // obiekt reprezentujący ściezkę
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku!");
            e.printStackTrace();
        }
    }
}
