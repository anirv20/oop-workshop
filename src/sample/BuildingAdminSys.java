package sample;

import java.util.*;

public class BuildingAdminSys implements IBuildingManagementSystem {
    private List<Building> buildings = new ArrayList<>();

    public void addBuilding(Building building) {
        this.buildings.add(building);
    }

    public void removeBuilding(UUID id) {
        for (Building b: this.buildings) {
            if (b.getID() == id) {
                this.buildings.remove(b);
            }
        }
    }

    public List<Building> getBuildings() {
        return this.buildings;
    }

    private Building getBuildingByID(UUID buildingID) {
        for (Building b : buildings) {
            if (b.getID() == buildingID) {
                return b;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "BuildingAdminSys{" +
                "buildings=" + buildings.toString() +
                '}';
    }

    @Override
    public Map<UUID, String> getBuildingInformation() {
        Map<UUID, String> map = new HashMap<UUID, String>();
        for (Building b : buildings) {
            map.put(b.getID(), b.getDescription());
        }
        return map;
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        Building building = getBuildingByID(buildingId);

        Map<UUID, String> map = new HashMap<UUID, String>();
        for (Sensor s : building.getSensors()) {
            map.put(s.getId(), s.getDescription());
        }
        return map;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        Building building = getBuildingByID(buildingId);

        Map<UUID, String> map = new HashMap<UUID, String>();
        for (Actuator a : building.getActuators()) {
            map.put(a.getId(), a.getDescription());
        }
        return map;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        Building building = getBuildingByID(buildingId);
        Sensor sensor = new TemperatureSensor(name);
        building.addSensor(sensor);
        return sensor.getId();
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name){
        Building building = getBuildingByID(buildingId);
        Sensor sensor = new CarbondioxideSensor(name);
        building.addSensor(sensor);
        return sensor.getId();
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {
        Building building = getBuildingByID(buildingId);
        building.removeSensor(sensorId);
    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
        Building building = getBuildingByID(buildingId);
        Actuator actuator = new VentilatorActuator(name);
        building.addActuator(actuator);
        return actuator.getId();
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
        Building building = getBuildingByID(buildingId);
        building.removeActuator(actuatorId);
    }

}
