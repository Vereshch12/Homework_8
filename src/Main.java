public class Main {
    public static void leapYear(int year){//проверка на високосный год с выдачей результата
        if (year % 4 == 0) {
            System.out.println("\n" + year + " год високосный!");
        }else
            System.out.println("\n" + year + " год не високосный!");

    }

    public static void task1(){// задание №1
        int year = 2020;
        leapYear(year);
    }


    public static void main(String[] args) {
        task1();
    }
}