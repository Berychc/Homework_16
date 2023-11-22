package Homework.course;

public class Bicycle extends Vehicle {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkChain() {
        System.out.println("Проверяем цепь " + getModelName());
    }
}
