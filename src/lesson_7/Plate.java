package lesson_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        if (food < amount) {
            increaseFood();
        } else {
            this.food -= amount;
        }
    }

    boolean checkFood(int amount) {
        return (food - amount) >= 0;
    }

    public void increaseFood() {
        this.food += 20;
        System.out.println("Еды мало! В тарелку добавили 20 гр. корма");
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.printf("В тарелке находится [ %d ] гр. корма\n", food);
    }
}