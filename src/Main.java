public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int age = 25;
        if (age >= 18) {
            System.out.println("Он совершеннолетний");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }
    }
}