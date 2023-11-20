package Homework.course;

public class ServiceStation {
    public static void checkVehicle(Vehicle vehicle) {
        System.out.println("Проводим осмотр " + vehicle.getModelName());

        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            car.updateTyre();
            car.checkEngine();
        } else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            truck.updateTyre();
            truck.checkEngine();
        } else if (vehicle instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) vehicle;
            bicycle.updateTyre();
            bicycle.checkChain();
        }

        System.out.println("Осмотр " + vehicle.getModelName() + " завершен");
    }
}
