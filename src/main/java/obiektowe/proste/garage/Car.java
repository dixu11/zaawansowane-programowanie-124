package obiektowe.proste.garage;

import java.util.List;
import java.util.Random;

public class Car {

   private final List<Wheel> wheels;

    public Car(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public void flatRandomTire(){
        Random random = new Random();
        Wheel unluckyWheel = wheels.get(random.nextInt(wheels.size()));

//        unluckyWheel.setFlat(true);
//        unluckyWheel.setPressure(0);
            unluckyWheel.flatMe();
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                '}';
    }
}
