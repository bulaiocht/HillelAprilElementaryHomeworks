package vehicle.counter;

import vehicle.entities.CrossRoadObserver;
import vehicle.entities.Type;
import vehicle.entities.Vehicle;

/**
 * Created by Kocherha Vitalii on 23.05.16.
 */
public class Counter {
    public static void main(String[] args) {
        Vehicle vOne = new Vehicle(Type.TRUCK, "MAN", "AS1357AV");
        Vehicle vTwo = new Vehicle(Type.LORY, "Volvo", "KL3358OP");
        Vehicle vThree = new Vehicle(Type.MOTRCICLE, "Yamaha", "CA23434B");
        Vehicle vFour = new Vehicle(Type.MOTRCICLE, "YAMAHA", "CA23422B");
        CrossRoadObserver observer = new CrossRoadObserver();
        observer.obsereveVehicle(vOne);
        observer.obsereveVehicle(vTwo);
        observer.obsereveVehicle(vThree);
        observer.obsereveVehicle(vFour);

        System.out.println(observer.getByType(Type.LORY));
        System.out.println(observer.getByType(Type.MOTRCICLE));
        System.out.println(observer.getByHash(vThree.hashCode()));
        System.out.println(observer.getByPlate("CA23422B"));
    }

}
