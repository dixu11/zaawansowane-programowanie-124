package obiektowe.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextFilesDemo {
    public static void main(String[] args) {
        //passat 1.9 tdi 180 tys km
        try {
            PrintWriter out = new PrintWriter("car.txt"); // przykładowe narzędzie do zapisu w pliku
            String car = "passat 1.9 tdi 180 tys km";
            out.println(car); //wydruk do pliku
            out.println(car);
            out.close(); // zamknięcie narzędzia
        } catch (FileNotFoundException e) {//obsłużyć wyjątki
            System.out.println("Problem z utworzeniem pliku!");
            e.printStackTrace();
        }
    }
}
