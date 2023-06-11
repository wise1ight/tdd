package org.example.money;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        Assertions.assertEquals(new Dollar(10), five.times(2));
        Assertions.assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        Assertions.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assertions.assertFalse(new Dollar(5).equals(new Dollar(6)));
        Assertions.assertTrue(new Franc(5).equals(new Franc(5)));
        Assertions.assertFalse(new Franc(5).equals(new Franc(6)));
        Assertions.assertFalse(new Franc(5).equals(new Dollar(5)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        Assertions.assertEquals(new Franc(10), five.times(2));
        Assertions.assertEquals(new Franc(15), five.times(3));
    }

}
