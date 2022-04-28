package de.com.tdd.money;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MoneyTest {

    @Test
    public void testMultiplication() {

        Money five=Money.dollar(5);
        assertEquals(Money.dollar(10),five.times(2));

        Money fiveF=Money.franc(5);
        assertEquals(Money.franc(10), fiveF.times(2));

    }

    @Test
    public void testEquality() {

        assertEquals(Money.dollar(5),Money.dollar(5));
        assertNotEquals(Money.dollar(5),Money.dollar(8));

        assertNotEquals(Money.dollar(5),Money.franc(5));

        assertEquals(Money.franc(5),Money.franc(5));
        assertNotEquals(Money.franc(5),Money.franc(8));

    }



    @Test
    public void testCurrency() {
        assertEquals("USD",Money.dollar(2).currency());
        assertEquals("CHF",Money.franc(2).currency());
    }
}
