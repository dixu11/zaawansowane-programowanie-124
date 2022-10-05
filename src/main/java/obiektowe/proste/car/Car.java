package obiektowe.proste.car;

public class Car {

    final static double KM_TO_SERVICE = 20_000;

    String brand;
    double mileageInKm;

    public Car(String brand, double mileageInKm) {
        this.brand = brand;
        this.mileageInKm = mileageInKm;
    }

    public void printInfo() {
        System.out.printf("Marka: %s, przebieg: %.0f\n"
                ,brand,mileageInKm);
    }

    public void drive(double distanceInKm){
        mileageInKm += distanceInKm;
    }

    public double getDistanceToService() {
        return  Math.abs(mileageInKm % KM_TO_SERVICE - KM_TO_SERVICE);
    }



    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", mileageInKm=" + mileageInKm +
                '}';
    }
}
