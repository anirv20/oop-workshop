package sample;

public class CarbondioxideSensor extends Sensor{

    public CarbondioxideSensor(double value) {
        super(value);
    }
    public CarbondioxideSensor(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "CO2 Sensor{" +
                "value=" + getValue() +
                ", id=" + getId() +
                '}';
    }
}
