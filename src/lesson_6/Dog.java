package lesson_6;

import lesson_6.Animal;

public class Dog extends lesson_6.Animal {

    private final String name;
    private final int maxRun;
    private final int maxSwim;

    public Dog(String name) {
        this.name = name;
        this.maxRun = 500;
        this.maxSwim = 10;
    }

    @Override
    public void run(double runLength) {
        if (runLength > 0 && runLength <= maxRun) {
            System.out.println("Собака по кличке " + name + " пробежала " + runLength + " метров");
        } else
            System.out.println(name + " не сможет столько пробежать");
    }

    @Override
    public void swim(double swimLength) {
        if (swimLength > 0 && swimLength <= maxSwim) {
            System.out.println("Собака по кличке " + name + " проплыла " + swimLength + " метров");
        } else
            System.out.println(name + " не сможет столько проплыть");
    }
}