package sample;

public class TemperatureSensor extends Sensor{

    public TemperatureSensor(double value) {
        super(value);
    }

    @Override
    public String toString() {
        return "Temperature Sensor{" +
                "value=" + getValue() +
                ", id=" + getId() +
                '}';
    }
}