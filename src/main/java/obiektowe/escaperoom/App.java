package obiektowe.escaperoom;

import java.util.ArrayList;
import java.util.List;

//rozruch programu i przygotowywanie niezbędnych do tego obiektów
public class App {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.startGame();
    }
}

/*    Object text = "abc";
        text = new Key();
                System.out.println(text.toUpperCase());*/
