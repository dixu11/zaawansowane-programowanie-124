package obiektowe.proste;

import java.util.Random;

public class PlaneDemo {
    public static void main(String[] args) {
        Random random = new Random();

        Plane plane = new Plane("Warszawa",33_000,180);
        Plane plane2 = new Plane("Katowice",33_000,220);
        Plane plane3 = new Plane("Berlin",33_000,220,20);

        System.out.println(plane);
        System.out.println(plane2);
        System.out.println(plane3);

        plane.load(100);
        plane2.load(150);
        plane3.load(200);

        System.out.println(plane);
        System.out.println(plane2);
        System.out.println(plane3);

        /*System.out.println(plane.usedSeats);
        System.out.println(plane2.usedSeats);
        System.out.println(plane3.usedSeats);

        System.out.println(plane.weightInKg);
        System.out.println(plane2.weightInKg);
        System.out.println(plane3.weightInKg);
*/






//        plane.city = "Warszawa";
//        plane2.city = "Katowice";
//        plane3.city = "Berlin";






    }
}
