package Homework.course;
public class Car extends Vehicle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем шину автомобиля");
    }

    public void checkEngine() {
        System.out.println("Проверка двигателя автомобиля");
    }
}

