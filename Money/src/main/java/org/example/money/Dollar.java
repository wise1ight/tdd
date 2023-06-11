package org.example.money;

public class Dollar extends Money {

    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    String currency() {
        return this.currency;
    }
}
