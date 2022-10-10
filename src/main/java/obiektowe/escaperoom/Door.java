package obiektowe.escaperoom;

public class Door extends Item{
    public Door() {
        super("Drzwi");
    }

    @Override
    public void use() {
        System.out.println("Używam drzwi");
    }
}
