package sample;

import java.util.ArrayList;
import java.util.List;

public class BuildingAdminSys {
    private List<Building> buildings = new ArrayList<>();

    public void addBuilding(Building building) {
        this.buildings.add(building);
    }

    public void removeBuilding(int id) {
        for (Building b: this.buildings) {
            if (b.getID() == id) {
                this.buildings.remove(b);
            }
        }
    }

    public List<Building> getBuildings() {
        return this.buildings;
    }
}
