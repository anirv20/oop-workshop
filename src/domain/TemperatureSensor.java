package domain;

public class TemperatureSensor extends Sensor{

    public TemperatureSensor(double value) {
        super(value);
    }
    public TemperatureSensor(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "Temperature Sensor{" +
                "value=" + getValue() +
                ", id=" + getId() +
                '}';
    }
}