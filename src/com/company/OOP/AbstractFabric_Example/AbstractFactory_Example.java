package com.company.OOP.AbstractFabric_Example;

/**
 * Created by Маша on 19.04.2017.
 */
public class AbstractFactory_Example {
    public static void main(String[] args) {

        AbstractFactory factory1 = new ConcreteFactory1();
        Client client1 = new Client(factory1);
        client1.execute();

        AbstractFactory factory2 = new ConcreteFactory2();
        Client client2 = new Client(factory2);
        client2.execute();
    }
}
