public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 3.");
        int year = 2000;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}