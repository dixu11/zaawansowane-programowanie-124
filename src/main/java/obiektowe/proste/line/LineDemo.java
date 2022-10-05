package obiektowe.proste.line;

public class LineDemo {
    public static void main(String[] args) {
        Line line1 = new Line(3,'*');
        Line line2 = new Line(70,'#');

//        line1.print();
//        line2.print();

        Rectangle rectangle = new Rectangle(line1,line2);
        rectangle.print();
    }
}


/*
* Stwórz klasę Linia. Obiekty tej klasy powinny mieć dwie cechy: długość i wypełnienie. W metodzie main stwórz 3 obiekty
*  linni i nadaj im różne długości i symbole wypełnienia. Następnie stwórz metodę void drukujLinie(), która ma drukować
* symbol ustawiony jako wypełnienie tyle razy, jaka jest ustawiona długość linii. np: przy ustawionej długości 6 i
* wypełnieniu "@" wydrukuje następującą linię:

@@@@@@

Przy długości 20 i  wypełnieniu "*" powinna wydrukować linię:

********************
*
* */

/*
* wariant trudniejszy: stwórz klasę Prostokat, i nadaj mu cechy:
*  wysokość, szerokość oraz wypełnienie.
* W main przygotuj 2 obiekty tego typu i zdefinuj (zainicjalizuj)
* wartości w ich polach. Stwórz analogiczną metodę jak dla linni,
* która będzie drukować prostokąt wykorzystując informacje zawarte w
* jego cechach.

 *
*
*
* */
