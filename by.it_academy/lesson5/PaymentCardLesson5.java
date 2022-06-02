package by.it_academy.lesson5;

public class PaymentCardLesson5 {
    private double balance;

    private PaymentCardLesson5(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "The card has a balance of " + balance;
    }

    private void eatAffordably() {
        if (balance >= 2.6) {
            balance -= 2.6;
        } else {
            System.out.println("Insufficient funds on the card");
        }
    }

    private void eatHeartily() {
        if (balance >= 4.6) {
            balance -= 4.6;
        } else {
            System.out.println("Insufficient funds on the card");
        }
    }

    private void addMoney(double amount) {
        if (amount < 0) {
            System.out.println("You can't transfer a negative amount");
        } else {
            balance += amount;
        }
    }

    public static void main(String[] args) {
        PaymentCardLesson5 paymentCard = new PaymentCardLesson5(10);
        System.out.println(paymentCard);
        paymentCard.eatHeartily();
        paymentCard.eatAffordably();
        System.out.println(paymentCard);
        paymentCard.addMoney(1.5);
        System.out.println(paymentCard);

    }
}
