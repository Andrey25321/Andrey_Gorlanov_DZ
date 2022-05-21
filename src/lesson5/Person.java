package lesson_5;

public class Person {
    public static void main(String[] args) {
        Employer[] person = new Employer[5];

        person[0] = new Employer("Иван", "Иванович", "Иванов", 33,
                "Engineer", 90000.50, "email@test.com", "+79005556575");

        person[1] = new Employer("Петр", "Петрович", "Петров", 25,
                "DevOps", 100000.00, "petrov@test.com", "+79999999999");

        person[2] = new Employer("Сидр", "Сидорович", "Сидоров", 35,
                "QA Engineer", 95000.85, "sidr@test.com", "+79054441155");

        person[3] = new Employer("Василий", "Васильевич", "Васильев", 60,
                "Java developer", 50000.99, "email@test.com", "+79013332255");

        person[4] = new Employer("Дворник", "Дворникович", "Дворников", 41,
                "Java developer", 500.00, "metla@metet.net", "+79053556687");

        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > 40) {
                person[i].getFullInfo();
            }
        }
    }
}