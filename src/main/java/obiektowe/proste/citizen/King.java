package obiektowe.proste.citizen;

public class King extends Citizen{

    public King(String name) {
        super(name);
        System.out.println("Powstaje King");
    }

    @Override
    public boolean canVote() {
        return false;
    }
}
