package org.example.money;

public class Franc extends Money {

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    String currency() {
        return this.currency;
    }
}
