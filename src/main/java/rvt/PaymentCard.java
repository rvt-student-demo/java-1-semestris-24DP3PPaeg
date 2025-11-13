package rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        String money = String.valueOf(balance);
        System.out.println("The card has a balance of " + money + " euros.");
        return money;
    }

    public void eatAffordably() {
        if (balance > 2.60) {
            balance = balance - 2.60;
        } else {
            ;
        }
    }

    public void eatHeartily() {
        if (balance > 4.60) {
            balance = balance - 4.60;
        } else {
            ;
        }
    }

    public void addMoney(double amount) {
        balance += amount;
    }
}
