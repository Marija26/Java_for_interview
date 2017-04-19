package com.company.OOP.AbstractFabric_Example;

/**
 * Created by Маша on 19.04.2017.
 */
public class ProductA2  implements AbstractProductA{
    @Override
    public void interact(AbstractProductA a) {
        System.out.println(this.getClass().getName() + " interacts with " + a.getClass().getName());
    }
}
