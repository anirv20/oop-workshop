package sample;

public class Main {
    public static void main(String[] args) {
        BuildingAdminSys admin = new BuildingAdminSys();
        admin.addBuilding(new Building());
        admin.addBuilding(new Building());
        admin.getBuildings().get(0).addActuator(new VentilatorActuator(0.9));
        admin.getBuildings().get(1).addSensor(new CarbondioxideSensor(1.5));
        System.out.println(admin.toString());
    }
}
