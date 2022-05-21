package lesson_6;

public class Cat extends lesson_6.Animal {

    private final String name;
    private final int maxRun;

    public Cat(String name) {
        this.name = name;
        this.maxRun = 200;
    }

    @Override
    public void run(double runLength) {
        if (runLength > 0 && runLength <= maxRun) {
            System.out.println("Кот по кличке " + name + " пробежал: " + runLength + " метров");
        } else
            System.out.println(name + " не сможет столько пробежать");
    }

    @Override
    public void swim(double swimLength) {
        System.out.println("Коты не умеют плавать! " + name + " утонул :(");
    }
}