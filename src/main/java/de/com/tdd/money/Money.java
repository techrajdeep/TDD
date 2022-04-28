package de.com.tdd.money;

public  class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String currency(){
        return this.currency;
    }

    public static Money dollar(int amount){
        return new Dollar(amount,"USD");
    }

    public static Money franc(int amount){
        return new Franc(amount,"CHF");
    }
    //As Dollar/franc is a value object we have to check whether its the same value and object or not
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Money money = (Money) o;
        return amount == money.amount  && currency.equalsIgnoreCase(money.currency());
    }

    // Returning a new object as we cann't use the same instance
    public Money times(int multiplier){
        return new Money(amount*multiplier,this.currency);
    }
}
