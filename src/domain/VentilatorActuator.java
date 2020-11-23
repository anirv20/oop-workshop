package domain;

public class VentilatorActuator extends Actuator {

    public VentilatorActuator(double value){
        super(value);
    }
    public VentilatorActuator(String description){
        super(description);
    }

    @Override
    public String toString() {
        return "Ventilator Actuator{" +
                "value=" + getValue() +
                ", id=" + getId() +
                '}';
    }
}
