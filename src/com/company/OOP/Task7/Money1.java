package com.company.OOP.Task7;

/**
 * Created by ПК on 12.01.2017.
 */
public abstract class Money1 {
    private double amount;

    public Money1(double amount) {
        this.amount = amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    abstract String getCurrencyName();
}

