package obiektowe.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;

public class WriteObjectDemo {
    public static void main(String[] args) {
        Car car = new Car("Volkswagen", "Passat", 180, 1.9);
        System.out.println(car);
        try {
            PrintWriter out = new PrintWriter("src/main/java/obiektowe/files/car2.csv"); // comma separeted values
            out.println(car.toCsv());
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //volkswagen passat 1.9 tdi 180 tys km
    }
}

