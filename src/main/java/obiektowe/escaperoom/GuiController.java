package obiektowe.escaperoom;

import javax.swing.*;
import java.util.List;

public class GuiController {

    private Game game=new Game();

    public void startGame() {
        JOptionPane.showMessageDialog(null,"Rozpoczynasz grę.");
        JOptionPane.showMessageDialog(null,"Widzisz pokój z różnymi przedmiotami, z którymi możesz wchodzić w interakcję");
        repeatInteraction();
        JOptionPane.showMessageDialog(null,"Gratulacje, rozwiązałeś zagadkę i wygrałeś!");
    }

    private void repeatInteraction() {
        do{
            executeInteraction();
        }while (game.isGameRunning());
    }

    private void executeInteraction() {
        showItems();
        String itemName = selectItem();
        useItem(itemName);
    }

    private void showItems() {
        List<Item> items = game.getItems();
        String text = "";
        for (Item item : items) {
            text += item.getName() + "\n";
        }
        JOptionPane.showMessageDialog(null,text);
    }

    private String selectItem() {
       return JOptionPane.showInputDialog("Wpisz nazwę przedmiotu, którego chcesz użyć: ");
    }

    private void useItem(String itemName) {
        try{
            String result = game.useItem(itemName);
            JOptionPane.showMessageDialog(null, result);
        }catch (ItemNotFoundException e){
            JOptionPane.showMessageDialog(null,"Nie znaleziono przedmiotu!");

        }
    }



}
