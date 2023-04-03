public class Main {
    public static void main(String[]args) {
        int balance = 150;
        int payment = 1000;
        int amount = balance + payment;
        int bonus;
        if (amount >= 1100) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int total = amount + bonus;

        System.out.println("Сумма на счете с учетом начисленных бонусов = " + total);





    }
}
