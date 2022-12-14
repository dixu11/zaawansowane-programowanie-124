package obiektowe.files.text;

import java.util.Objects;

class Car {
    private String brand;
    private String model;
    private double mileageInThousandsKm;
    private double capacity;

    public Car(String brand, String model, double mileageInThousandsKm, double capacity) {
        this.brand = brand;
        this.model = model;
        this.mileageInThousandsKm = mileageInThousandsKm;
        this.capacity = capacity;
    }


    public String toCsv() {
        return String.format("%s;%s;%.1f;%.1f",brand,model,mileageInThousandsKm,capacity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.mileageInThousandsKm, mileageInThousandsKm) == 0 && Double.compare(car.capacity, capacity) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, mileageInThousandsKm, capacity);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mileageInThousandsKm=" + mileageInThousandsKm +
                ", capacity=" + capacity +
                '}';
    }
}