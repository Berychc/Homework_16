package Homework.course;

public class Truck extends Vehicle {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем шину грузовика");
    }

    public void checkEngine() {
        System.out.println("Проверка двигателя грузовика");
    }
}
