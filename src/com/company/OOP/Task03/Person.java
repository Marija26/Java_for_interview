package com.company.OOP.Task03;

/**
 * Created by ПК on 12.12.2016.
 */

public class Person implements RepkaItem{
    private String name;
    private String namePadezh;
    public Person(String name, String namePadezh){
        this.name = name;
        this.namePadezh = namePadezh;

    }
    public void pull(Person person){
        System.out.println (name + " za " + person.getNamePadezh ());

    }
    @Override
    public String getNamePadezh() {
        return namePadezh;
    }



}

