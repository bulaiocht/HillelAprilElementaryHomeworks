package vehicle.entities;

import java.util.ArrayList;

/**
 * Created by Kocherha Vitalii on 23.05.16.
 */
public class CrossRoadObserver {

    private ArrayList<Vehicle> pass = new ArrayList<>();

    public void obsereveVehicle(Vehicle vehicle) {
        this.pass.add(vehicle);
    }


    public ArrayList<Vehicle> getByType(Type type) {
        ArrayList<Vehicle> vehiclesByType = new ArrayList<>();
        for (Vehicle vehicle : pass) {
            if (vehicle.getType().equals(type)) {
                vehiclesByType.add(vehicle);
            }
        }
        return vehiclesByType;
    }

    public ArrayList<Vehicle> getByModel(String model) {
        ArrayList<Vehicle> vehiclesByModel = new ArrayList<>();
        for (Vehicle vehicle : pass) {
            if (vehicle.getModel().equalsIgnoreCase(model)) {
                vehiclesByModel.add(vehicle);
            }
        }
        return vehiclesByModel;
    }

    public ArrayList<Vehicle> getByPlate(String licensePlate) {
        ArrayList<Vehicle> vehiclesByPlate = new ArrayList<>();
        for (Vehicle vehicle : pass) {
            if (vehicle.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                vehiclesByPlate.add(vehicle);
            }
        }
        return vehiclesByPlate;
    }

    public boolean getByHash(int hash) {
        for (Vehicle vehicle : pass) {
            if (vehicle.hashCode() == hash) return true;
        }
        return false;
    }


}
