public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        System.out.println(" ");
        System.out.println("Задача 2.");
        int clientOS = 1; // (0 — iOS, 1 — Android)
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        System.out.println(" ");
        System.out.println("Задача 3.");
        int year = 2000;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println(" ");
        System.out.println("Задача 4.");
        int DeliveryDistance = 95;
        if (DeliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else {
            int AmountDays = (DeliveryDistance - 20);
            if ((AmountDays % 40 == 0)) {
                int NewAmountDays = (AmountDays / 40) + 1;
                System.out.println("Потребуется дней: " + NewAmountDays);
            } else {
                int NewAmountDays2 = (AmountDays / 40) + 2;
                System.out.println("Потребуется дней: " + NewAmountDays2);
            }
        }
        System.out.println(" ");
        System.out.println("Задача 5.");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон года - зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон года - весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон года - лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон года - осень.");
                break;
            default:
                System.out.println("Месяца с таким номером не существует.");

        }
    }
}