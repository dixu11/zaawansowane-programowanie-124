package obiektowe.escaperoom;

import java.util.List;

//logika biznesowa aplikacji
public class Game {

    private Room room = new Room();

    public List<Item> getItems() {
        return room.getItems();
    }
}
