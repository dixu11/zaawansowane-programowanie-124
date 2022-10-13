package obiektowe.files.text;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteObjectDemo {
    public static void main(String[] args) {
        Car car = new Car("Volkswagen", "Passat", 180, 1.9);
        System.out.println(car);
        try {
            PrintWriter out = new PrintWriter("src/main/java/obiektowe/files/text/car2.csv"); // comma separeted values
            out.println(car.toCsv());
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //volkswagen passat 1.9 tdi 180 tys km
    }
}

