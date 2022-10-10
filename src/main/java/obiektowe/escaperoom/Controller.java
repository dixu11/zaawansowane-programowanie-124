package obiektowe.escaperoom;

import java.util.List;

// klasa do interakcjni z aplikacją - wyświetla komunikaty, pozwala wprowadzać decyzje gracza do programu
public class Controller {

private Game game=new Game();
    public void startGame() {
        System.out.println("Rozpoczynasz grę.");
        System.out.println("Widzisz pokój z różnymi przedmiotami, z którymi możesz wchodzić w interakcję");
       List<Item> items=  game.getItems();
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }



}
