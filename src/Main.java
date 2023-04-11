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
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        byte speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф ");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно ");
        }

        byte old = 23;
        boolean institution1 = old >= 2 && old <= 6;
        boolean institution2 = old >= 7 && old <= 18;
        boolean institution3 = old >= 18 && old <= 24;
        if (institution1) {
            System.out.println("Если возвраст человека равен " + old + " лет, то ему нужно ходить в детский сад");
        }
        if (institution2) {
            System.out.println("Если возвраст человека равен " + old + " лет, то ему нужно ходить в школу");
        }
        if (institution3) {
            System.out.println("Если возвраст человека равен " + old + " лет, то ему нужно ходить в университет");
        } else {
            System.out.println("Если возвраст человека равен " + old + " лет, то ему пора ходить на работу");
        }



        byte ageChildren = 8;
        boolean ageLol1 = ageChildren < 5;
        boolean ageLol2 = ageChildren > 5 && ageChildren < 14;
        if (ageLol1) {
            System.out.println("Если возвраст ребенка равен " + ageChildren + ", то ему нельзя кататься на атракцеоне");
        }
        if (ageLol2) {
            System.out.println("Если возвраст ребенка равен " + ageChildren + ", то ему можно кататься на атракцеоне в сопровождении");
        } else {
            System.out.println("Если возвраст ребенка равен " + ageChildren + ", то ему можно кататься на атракцеоне");
        }


        byte capacityWagon = 102;
        byte sittingPlace = 60;
        byte standingPlace = (byte) (capacityWagon - sittingPlace);
        byte sittingWagon = 61;
        byte standingWagon = 43;
        byte sittingRemained = (byte) (sittingPlace - sittingWagon);
        byte standingRemained = (byte) (standingPlace - standingWagon);
        boolean gone1 = sittingWagon <= sittingPlace || standingWagon <= standingPlace;
        if (gone1) {
            System.out.println("В вагоне осталось " + sittingRemained + " сидячих мест и " + standingRemained + " стоячих мест");
        } else {
            System.out.println("В вагоне не осталось свободных мест " );
        }


        int one = 6;
        int two = 14;
        int three = 15;
        boolean moreOne = one > two && one > three;
        boolean moreTwo = one < two && two > three;
        if (moreOne) {
            System.out.println("Число " + one + " больше всех");
        }
        if (moreTwo) {
            System.out.println("Число " + two + " больше всех");
        } else {
            System.out.println("Число " + three + " больше всех");
        }
    }
}