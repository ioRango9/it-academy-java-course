package by.it_academy.lesson5;

public class PaymentCard {
    private double balance;

    PaymentCard(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        PaymentCard paymentCard = new PaymentCard(10);
        System.out.println(paymentCard);
        paymentCard.eatHeartily();
        paymentCard.eatAffordably();
        System.out.println(paymentCard);
        paymentCard.addMoney(1.5);
        System.out.println(paymentCard);
    }

    public String toString() {
        return "The card has a balance of " + balance;
    }

    void eatAffordably() {
        if (balance >= 2.6) {
            balance -= 2.6;
        }
    }

    void eatHeartily() {
        if (balance >= 4.6) {
            balance -= 4.6;
        }
    }

    void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
