package com.example;

public class Money {
    protected int amount;

    public boolean equals(Object object){
        Money money = (Money) object;
        // 자바 객체 용어보다는 재정 용어를 사용하고 싶지만 통화 개념 없음
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
