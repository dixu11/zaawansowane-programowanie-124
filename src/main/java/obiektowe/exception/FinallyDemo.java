package obiektowe.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("Liczba: " + readNumber());
    }


    static int readNumber() {
        System.out.println("Napisz liczbę:");
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            return number;
        }catch (InputMismatchException e){
            System.out.println("Błąd!");
            return -1;
        }finally {
            System.out.println("Kod finally");
        }
    }
}
