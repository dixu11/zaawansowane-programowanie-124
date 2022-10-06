package obiektowe.proste.line;

import java.util.Random;

public class LineFactory {

    //linię losowej długości z wybranym znakiem,
    public Line getLineWith(char fill) {
        Random random = new Random();
        int length = random.nextInt(1,50);
        return new Line(length, fill);
    }

    public Line getLineWith(int length){
        Random random = new Random();
        int randomAsciNumber = random.nextInt(33, 127);
        char randomFill = (char) randomAsciNumber;
        return new Line(length, randomFill);
    }






}
