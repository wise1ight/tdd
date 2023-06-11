package org.example.money;

public class Franc extends Money {

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier, currency);
    }

    @Override
    String currency() {
        return this.currency;
    }
}
