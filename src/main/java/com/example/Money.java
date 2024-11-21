package com.example;

public abstract class Money {
    protected int amount;
    protected String currency;

    abstract Money times(int multiplier);
//    abstract String currency();

    String currency(){
        return currency;
    }

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        // 자바 객체 용어보다는 재정 용어를 사용하고 싶지만 통화 개념 없음
        return amount == money.amount && getClass().equals(money.getClass());
    }

    static Money dollar(int amount){
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount){
        return new Franc(amount, "CHF");
    }
}
