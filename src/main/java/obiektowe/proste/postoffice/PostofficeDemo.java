package obiektowe.proste.postoffice;

import java.time.LocalDate;

public class PostofficeDemo {
    public static void main(String[] args) {
        //Package parcel = new Package(" ", null,1000);
        LocalDate date = LocalDate.of(2034,13,20);


    }
}

/*
* Poczta part 1

Zaprojektuj i przetestuj nowy, referencyjny typ danych: Paczka.
Paczki mogą mieć nadawcę, odbiorcę oraz wagę, wyrażoną z dokładnością do gramów.
Mogą również być priorytetowe lub nie, domyślnie nie są.
Tworząc paczkę trzeba podać nadawcę, odbiorcę oraz jej wagę.

Konstruktor powinien skontrolować te wartości i wyświetlić błąd jeśli:
adresat lub nadawca nie został podany
waga nie mieści się w zakresie 1- 1000.

skontroluj, czy cechy paczek ustawiają się poprawnie


Przygotuj drugi alternatywny sposób tworzenia paczek (👉konstruktor), który będzie losował imię nadawcy, imię odbiorcy, wagę paczki i to czy jest ona priorytetowa czy nie.

Przygotuj również metodę pozwalającą wyliczyć i zwrócić cenę paczki, która zostanie wyliczona na podstawie jej parametrów:
paczka do 0.5 kg  kosztuje 5 zł
do 1kg kosztuje 8zł
do 2 kg kosztuje 12 zł
powyżej 2kg doliczane jest 1 zł za każdy kilogram
paczka kosztuje 10% drożej jeśli jest priorytetowa

manipulacje zmiennymi:
Przygotuj w main dwie zmienne z paczkami
Stwórz jedną zmienną bez paczki, zainicjowaną wartością null.
Sprawdź cenę paczek wykorzystując te 3 zmienne.
Napisz instrukcję, która wstawi pierwszą paczkę do trzeciej zmiennej i zastąpi nulla
wyświetl cenę paczki w trzeciej zmiennej
 Przetestuj co się stanie jeśli ustawisz wszystkie zmienne jako “final”.

*
*
*
*
* */
