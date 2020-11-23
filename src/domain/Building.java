package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Building {
    private UUID id;
    private String description;
    private List<Sensor> sensors = new ArrayList<>();
    private List<Actuator> actuators = new ArrayList<>();

    public Building() {
        this.id = UUID.randomUUID();
        this.description = "This is a building.";
    }

    public Building(String description) {
        this.id = UUID.randomUUID();
        this.description = description;
    }

    public Building(List<Sensor> sensors, List<Actuator> actuators, String description) {
        this.id = UUID.randomUUID();
        this.sensors = sensors;
        this.actuators = actuators;
        this.description = description;
    }

    public UUID getID() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public List<Sensor> getSensors() {
        return sensors;
    }

    public List<Actuator> getActuators() {
        return actuators;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public void addActuator(Actuator actuator){
        this.actuators.add(actuator);
    }

    public void removeSensor(UUID id) {
        for (Sensor s: sensors) {
            if (s.getId() == id) {
                sensors.remove(s);
            }
        }
    }

    public void removeActuator(UUID id) {
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
