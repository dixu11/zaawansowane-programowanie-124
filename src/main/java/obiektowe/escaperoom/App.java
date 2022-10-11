package obiektowe.escaperoom;

//rozruch programu i przygotowywanie niezbędnych do tego obiektów
public class App {
    public static void main(String[] args) {
//        String name = JOptionPane.showInputDialog("Jak masz na imie? ");
//        JOptionPane.showMessageDialog(null,"Hello " + name);
        ConsoleController consoleController = new ConsoleController();
        consoleController.startGame();
    }
}

/*    Object text = "abc";
        text = new Key();
                System.out.println(text.toUpperCase());*/
