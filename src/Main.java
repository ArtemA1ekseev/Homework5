public class Main {
    public static void main(String[] args) {
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
    }
}