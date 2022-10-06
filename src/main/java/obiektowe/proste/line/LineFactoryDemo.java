package obiektowe.proste.line;

public class LineFactoryDemo {
    public static void main(String[] args) {
        LineFactory factory = new LineFactory();
        Line line = factory.getLineWith('$');
        line.print();
        System.out.println();
        factory.getLineWith(1).print();
        factory.getLineWith(2).print();
        factory.getLineWith(3).print();
        factory.getLineWith(4).print();
        factory.getLineWith(5).print();
        factory.getLineWith(6).print();

        for (int i = 0; i < 100; i++) {
            factory.getLineWith(i).print();
        }
        for (int i = 100; i > 0; i--) {
            factory.getLineWith(i).print();
        }
    }
}


/*
* 48. Fabryka Linii
W programie z Liniami stwórz dodatkową klasę: FabrykaLinii,
* a w niej stwórz metody, wytwarzające i zwracające:
linię losowej długości z wybranym znakiem,
linię wybranej długości ale z losowym znakiem,
linię z losową długością i losowym znakiem
określoną ilość linni z losową długością i znakiem
(wykorzystaj wcześniejszą metodę)
linię z długością 2 i losowym znakiem ale każda kolejna zwrócona
*  linia ma być 2x większa od poprzedniej
Następnie w klasie LinieDemo przetestuj wszystkie metody drukując
*  wyprodukowane przez nie linie.

*
*
*
* */
