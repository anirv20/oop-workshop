package sample;

public abstract class Actuator {
    private double value;
    private int id;
    private static int idCounter=1;

    public Actuator(double value){
        this.value =value;
        this.id = idCounter;
        idCounter++;

    }

    public double getValue() {
        return this.value;
    }

    public int getId() {
        return this.id;
    }
}
