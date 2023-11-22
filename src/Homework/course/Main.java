package Homework.course;

public class Main {
    public static void main(String[] args) {
        Vehicle truck = new Truck("truck_1", 6);
        Vehicle bicycle = new Bicycle("bicycle_1", 2);
        Vehicle car = new Car("car_1", 4);


        ServiceStation.checkVehicle(truck);
        System.out.println();
        ServiceStation.checkVehicle(bicycle);
        System.out.println();
        ServiceStation.checkVehicle(car);
    }
}