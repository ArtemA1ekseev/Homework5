public class Main {
    public static void main(String[] args) {
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