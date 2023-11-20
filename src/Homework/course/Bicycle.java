package Homework.course;

public class Bicycle extends Vehicle {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }

    public void checkChain() {
        System.out.println("Проверка цепи велосипеда");
    }
}
