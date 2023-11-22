package Homework.course;

public class ServiceStation {
    public static void checkVehicle(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName() + ", кол-во колес: " + vehicle.getWheelsCount());
        vehicle.updateTyre();

        if (vehicle.getClass().equals(Truck.class)) {
            ((Truck) vehicle).checkEngine();
        } else if (vehicle.getClass().equals(Bicycle.class)) {
            ((Bicycle) vehicle).checkChain();
        } else if (vehicle.getClass().equals(Car.class)) {
            ((Car) vehicle).checkEngine();
        }
    }
}
