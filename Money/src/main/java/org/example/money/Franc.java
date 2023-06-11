package org.example.money;

public class Franc extends Money {

    private String currency;

    Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = "CHF";
    }

    Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

    @Override
    String currency() {
        return this.currency;
    }
}
