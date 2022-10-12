package obiektowe.collections.restaurant;

public class Dish {
    private String name;
    private double price;
    private int calories;
    private DishType type;

    public Dish(String name, double price, int calories, DishType type) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}
