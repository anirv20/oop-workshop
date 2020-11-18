package sample;

public class CarbondioxideSensor extends Sensor{

    public CarbondioxideSensor(double value) {
        super(value);
    }

    @Override
    public String toString() {
        return "CO2 Sensor{" +
                "value=" + getValue() +
                ", id=" + getId() +
                '}';
    }
}
