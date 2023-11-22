package Homework.course;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("truck_1", 6);
        Bicycle bicycle = new Bicycle("bicycle_1", 2);
        Car car = new Car("car_1", 4);

        ServiceStationPlace serviceStationPlace = new ServiceStationPlace();
        serviceStationPlace.check(truck);
        System.out.println();
        serviceStationPlace.check(bicycle);
        System.out.println();
        serviceStationPlace.check(car);
    }
}