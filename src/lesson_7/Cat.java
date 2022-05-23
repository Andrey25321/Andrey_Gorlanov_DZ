package lesson_7;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean isHungry;
    private int satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = 0;
        this.isHungry = true;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println("Кот: " + name + ", голод: " + isHungry);
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        if (satiety == 1) {
            System.out.println(name + " больше не голоден");
        } else if (plate.getFood() >= appetite ) {
            plate.decreaseFood(appetite);
            setSatiety(1);
            setHungry(false);
            System.out.printf("%s съел %d гр. корма\n", this.name, this.appetite);
            info();
            plate.info();
        }
    }
}