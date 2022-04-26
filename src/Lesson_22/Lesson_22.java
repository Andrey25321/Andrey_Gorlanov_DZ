public class Lesson_22 {
    public static void main(String[] arge) {
        System.out.println(number_1(4, 8));
        number_2(6);
        System.out.println(number_3(-5));
        name ();
        number_4 ();

    }
    public static boolean number_1 (int a, int b) {

        int sum = a+b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
    public static void number_2 (int a){

        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число " + a + " отрицательное");
    }
    public static boolean number_3 (int a){

        if (a < 0) return true;
        return false;
    }
    public static void name () {
        System.out.println("Меня зовут Андрей");
    }
    static void number_4 () {

        int n = 0;
        while (n < 5) {
            name();
            n++;
        }
    }



}
