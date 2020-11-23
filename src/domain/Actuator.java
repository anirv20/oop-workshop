package domain;

import java.util.UUID;

public abstract class Actuator {
    private double value;
    private UUID id;
    private static int idCounter=1;
    private String description;


    public Actuator(double value){
        this.value =value;
        this.id = UUID.randomUUID();
        this.description = "This is an actuator!";

    }
    public Actuator(String description){
        this.value = 1;
        this.id = UUID.randomUUID();
        this.description = description;

    }


    public double getValue() {
        return this.value;
    }

    public UUID getId() {
        return this.id;
    }

    public String getDescription(){
        return this.description;
    }



   public void setDescription(String description){
        this.description = description;
   }
}
