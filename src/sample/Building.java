package sample;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private static int idCounter = 1;
    private int id;
    private List<Sensor> sensors = new ArrayList<>();
    private List<Actuator> actuators = new ArrayList<>();

    public Building() {
        this.id = idCounter;
        idCounter++;
    }

    public Building(List<Sensor> sensors, List<Actuator> actuators) {
        this.id = idCounter;
        idCounter++;
        this.sensors = sensors;
        this.actuators = actuators;
    }

    public int getID() {
        return id;
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public void addActuator(Actuator actuator){
        this.actuators.add(actuator);
    }

    public void removeSensor(int id) {
        for (Sensor s: sensors) {
            if (s.getId() == id) {
                sensors.remove(s);
            }
        }
    }

    public void removeActuator(int id) {
        for (Actuator a: actuators) {
            if (a.getId() == id) {
                actuators.remove(a);
            }
        }
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", sensors=" + sensors.toString() +
                ", actuators=" + actuators.toString() +
                '}';
    }
}
