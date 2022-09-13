public class Main {
    public static void main(String[] args) {

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
    }
}