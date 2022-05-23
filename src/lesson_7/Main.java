package lesson_7;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = {

                new Cat("Барсик", 1),
                new Cat("Филя", 5),
                new Cat("Василий", 20),
                new Cat("Тимоша", 14),
                new Cat("Сеня", 3),
                new Cat("Кит", 7),
                new Cat("Жора", 8)
        };

        Plate plate = new Plate(10);
        plate.info();

        for (Cat cat : cats) {
            if (cat.isHungry() && cat.getAppetite() <= plate.getFood()) {
                cat.eat(plate);
            }
            if (!plate.checkFood(cat.getAppetite()) && cat.getAppetite() > plate.getFood()) {  //
                plate.increaseFood();
            }
        }

        for (Cat cat2 : cats) {
            if (cat2.getSatiety() == 0) {
                plate.increaseFood();
                cat2.eat(plate);
            }
        }

        for (Cat cat3 : cats) {
            cat3.eat(plate);
        }

        for (Cat cat1 : cats) {
            if (!cat1.isHungry()) {
                System.out.printf("%s наелся\n", cat1.getName());
            } else {
                System.out.printf("%s остался голодным, ему не хватило %d единиц еды\n", cat1.getName(), cat1.getAppetite() - plate.getFood());
            }
        }
    }
}