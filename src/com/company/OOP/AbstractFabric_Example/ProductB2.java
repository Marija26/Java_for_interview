package com.company.OOP.AbstractFabric_Example;

/**
 * Created by Маша on 19.04.2017.
 */
public class ProductB2 implements AbstractProductB {
    @Override
    public void interact(AbstractProductB b) {
        System.out.println(this.getClass().getName() + " interacts with " + b.getClass().getName());
    }
}
