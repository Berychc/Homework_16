package Homework.course;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("car1", 4);
        Vehicle truck = new Truck("truck1", 6);
        Vehicle bicycle = new Bicycle("bicycle1", 2);


        ServiceStation.checkVehicle(car);
        System.out.println();
        ServiceStation.checkVehicle(truck);
        System.out.println();
        ServiceStation.checkVehicle(bicycle);
    }
}