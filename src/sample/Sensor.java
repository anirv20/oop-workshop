package sample;

public abstract class Sensor {
    private double value;
    private int id;
    private static int idCounter=1;

    public Sensor (double value){
        this.id = idCounter;
        this.value = value;
        idCounter++;
    }

    public double getValue() {
        return this.value;
    }

    public int getId() {
        return this.id;

    }
}