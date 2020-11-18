package sample;

public class VentilatorActuator extends Actuator {

    public VentilatorActuator(double value){
        super(value);
    }
    @Override
    public String toString() {
        return "Ventilator Actuator{" +
                "value=" + getValue() +
                ", id=" + getId() +
                '}';
    }
}
