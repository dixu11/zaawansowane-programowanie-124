package obiektowe.proste.car;

public class CarDemo {

    public static void main(String[] args) {
        Car car1 = new Car("Mercedes",50_000);
        Car car2 = new Car("Fiat",80_013);

        System.out.println(car1);
        System.out.println(car2);

        car1.printInfo();
        car2.printInfo();

        car1.drive(100);

        car1.printInfo();

        System.out.println(car1.getDistanceToService());
        System.out.println(car2.getDistanceToService());
    }

}


/*
* Stwórz klasę typu Samochod oraz SamochodDemo z metodą main.
W metodzie main stwórz dwa obiekty typu samochód.
Obiekty typu Samochod mają mieć następujące cechy: marka, przebieg oraz przebieg do przeglądu, ta ostatnia uzupełniona jakąś wartością np 20 000 km.
W metodzie main nadaj wartości dla cech stworzonych wcześniej samochodów.

Dla obiektów typu Samochod przygotuj następujące zachowania oraz przetestuj je w main:

Stwórz metodę wyświetlającą markę samochodu oraz przebieg
Stwórz metodę przyjmującą odległość do przejechania i zwiększającą przebieg samochodu o tę odległość
Stwórz metodę zwracającą ilość kilometrów po których trzeba będzie wykonać przegląd (uwzględniając aktualny przebieg)
* */