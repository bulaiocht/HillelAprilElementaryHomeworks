package vehicle.entities;

/**
 * Created by Kocherha Vitalii on 23.05.16.
 */
public class Vehicle {
    private Type type;
    private String model;
    private String licensePlate;

    public Vehicle(Type type, String model, String licensePlate) {
        this.type = type;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public Type getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;

        Vehicle vehicle = (Vehicle) o;

        if (type != vehicle.type) return false;
        if (model != null ? !model.equals(vehicle.model) : vehicle.model != null) return false;
        return licensePlate != null ? licensePlate.equals(vehicle.licensePlate) : vehicle.licensePlate == null;

    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (licensePlate != null ? licensePlate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Type: " + type +
                ", Model: '" + model + '\'' +
                ", License plate:'" + licensePlate + '\'' +
                '}';
    }
}
