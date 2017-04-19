package com.company.OOP.FactoryMethod;

/**
 * Created by Маша on 19.04.2017.
 */
public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
