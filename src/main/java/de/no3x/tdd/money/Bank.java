package de.no3x.tdd.money;

public class Bank {

    public Money reduce(Expression source, String to) {
        Sum sum = (Sum) source;
        return sum.reduce(to);
    }
}
