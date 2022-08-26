public class Main {
    public static void checkForLeapYear(int year) {//проверка на високосный год с выдачей результата
        if (year % 4 == 0) {
            System.out.println("\n" + year + " год високосный!");
        } else
            System.out.println("\n" + year + " год не високосный!");

    }

    public static void checksForApplicationVersion(byte clientOS, int yearOfIssue) {// проверка на версию приложения
        if (clientOS == 0) {
            if (yearOfIssue >= 2015) {
                System.out.println("\nУстановите версию приложения для iOS по ссылке");
            } else
                System.out.println("\nУстановите облегченную версию приложения для iOS по ссылке");
        } else {
            if (yearOfIssue >= 2015) {
                System.out.println("\nУстановите версию приложения для Android по ссылке");
            } else
                System.out.println("\nУстановите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void specifiesTheDeliveryTime(int deliveryDistance) {// определяет количество дней на доставку
        int deliveryPeriod = 1;
        if (deliveryDistance < 20){
            System.out.println("\nПотребуется дней на доставку: " + deliveryPeriod);
        }else {
            deliveryPeriod += 1 + (deliveryDistance - 20) / 40;
            System.out.println("\nПотребуется дней на доставку: " + deliveryPeriod);
        }
    }

    public static void task1() {// задание №1
        int year = 2020;
        checkForLeapYear(year);
    }

    public static void task2() {// заадние №2
        int yearOfIssue = 2014;
        byte clientOS = 0;
        checksForApplicationVersion(clientOS, yearOfIssue);
    }

    public static void task3() {// заадние №3
        int deliveryDistance = 120;
        specifiesTheDeliveryTime(deliveryDistance);
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
}