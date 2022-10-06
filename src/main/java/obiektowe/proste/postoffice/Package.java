package obiektowe.proste.postoffice;

public class Package {

    String sender;
    String recipient;
    int weightInGram;
    boolean priority;

    public Package(String sender, String recipient, int weightInGram) {
        validateSender(sender);
        this.sender = sender;

        this.recipient = recipient;
        if (   recipient == null || recipient.isBlank()) {
            System.out.println("Nie podano odbiorcy");
        }

        this.weightInGram = weightInGram;
        priority = false;
    }

    private void validateSender(String sender){
        if (sender == null|| sender.isBlank()) {
            System.out.println("Nie podano nadawcy");
            throw new IllegalArgumentException("Nie podano nadawcy");
        }
    }
/*
    Konstruktor powinien skontrolować te wartości i wyświetlić błąd jeśli:
    adresat lub nadawca nie został podany
    waga nie mieści się w zakresie 1- 1000.*/

}
