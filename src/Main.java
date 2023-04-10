public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1 () {
        System.out.println("Урок 1");

        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }

        byte temperature = 15;
        if (temperature < 5) {
            System.out.println("На улице " + temperature +  " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature +  " градусов, можно идти без шапки");
        }

        byte speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф ");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно ");
        }
    }
}