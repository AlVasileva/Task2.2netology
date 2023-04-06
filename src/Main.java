public class Main {
    public static void main(String[]args) {
        int balance = 50;
        int payment = 1001;
        int amount = balance + payment;
        int bonus;
        if (amount >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int total = amount + bonus;

        System.out.println("Сумма на счете с учетом начисленных бонусов = " + total);





    }
}
