package obiektowe.proste.garage;

public class Wheel {

    private double pressure;
    private boolean flat = false;

    public Wheel(double pressure) {
        this.pressure = pressure;
    }

    public void flatMe(){
        flat = true;
        pressure = 0;
    }

 /*   public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setFlat(boolean flat) {
        this.flat = flat;
    }*/

    @Override
    public String toString() {
        return "Wheel{" +
                "pressure=" + pressure +
                ", flat=" + flat +
                '}';
    }
}
