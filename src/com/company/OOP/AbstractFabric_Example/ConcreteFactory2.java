package com.company.OOP.AbstractFabric_Example;

/**
 * Created by Маша on 19.04.2017.
 */
public class ConcreteFactory2 implements AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
