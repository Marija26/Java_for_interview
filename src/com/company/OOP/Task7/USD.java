package com.company.OOP.Task7;

/**
 * Created by ПК on 13.01.2017.
 */
public class USD extends Money1 {
    public USD(double amount)
    {
        super (amount);
    }

    String getCurrencyName() {
        return "USD";

    }
}
