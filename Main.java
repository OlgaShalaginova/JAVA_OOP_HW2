package org.example.OOP.HW2;

public class Main {
    public static void main(String[] args) {
        Human hm = new Human();
        hm.setName("Olga");

        Market market = new Market();

        market.acceptToMarket(hm);
        market.takeInQueue(hm);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
        market.update();

    }
}