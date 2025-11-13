package rvt;

public class App {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(5);
        card.toString();

        card.eatHeartily();
        card.toString();


        card.addMoney(10);
        card.toString();
    }

}