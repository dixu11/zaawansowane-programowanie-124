package obiektowe.escaperoom;

import java.util.ArrayList;
import java.util.List;

//rozruch programu i przygotowywanie niezbędnych do tego obiektów
public class App {
    public static void main(String[] args) {
        List<Object> items = new ArrayList<>();

        Object text = "abc";
        text = new Key();
        System.out.println(text.toUpperCase());


        items.add(new Key());
        items.add(new Window());

    }
}

/*    Object text = "abc";
        text = new Key();
                System.out.println(text.toUpperCase());*/
