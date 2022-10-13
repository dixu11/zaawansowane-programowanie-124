package obiektowe.files.bin;

import java.io.*;

public class BinSerializationDemo {
    //należy włączyć serializację obiektu Car, implementując interfejs Serializable
    public static void main(String[] args) {
        Engine engine = new Engine("TDI");
        Car car = new Car("Volkswagen", "Passat",
                180, 1.9, engine);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                    "src/main/java/obiektowe/files/bin/car.bin"));
            oos.writeObject(car);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Nie udało się utworzyć pliku");
        }
    }
}
