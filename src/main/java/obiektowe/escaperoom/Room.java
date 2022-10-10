package obiektowe.escaperoom;

import java.util.ArrayList;
import java.util.List;

public class Room {

   private List<Item> items = new ArrayList<>();

   public Room() {
      items.add(new Door("Drzwi"));
      items.add(new Window("Okno"));
      items.add(new Key("Klucz"));
   }

   public List<Item> getItems() {
      return items;
   }

}
