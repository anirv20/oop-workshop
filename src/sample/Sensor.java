package sample;

import java.util.UUID;

public abstract class Sensor {
    private double value;
    private String description;
    private UUID id;

    public Sensor (double value){
        this.id = UUID.randomUUID();
        this.value = value;
        this.description = "This is a sensor.";
    }

    public Sensor (String description) {
        this.id = UUID.randomUUID();
        this.value = 1;
        this.description = description;
    }

    public double getValue() {
        return this.value;
    }

    public UUID getId() {
        return this.id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}