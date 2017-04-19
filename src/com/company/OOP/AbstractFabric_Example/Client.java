package com.company.OOP.AbstractFabric_Example;

/**
 * Created by Маша on 19.04.2017.
 */
public class Client {
    private AbstractProductA productA;
    private AbstractProductB productB;

    Client(AbstractFactory factory) {
        productA = factory.createProductA();
        productB = factory.createProductB();
    }

    void execute() {
        productB.interact((AbstractProductB) productA);
    }
}
