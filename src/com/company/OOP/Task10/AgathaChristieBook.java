package com.company.OOP.Task10;

/**
 * Created by ПК on 23.01.2017.
 */
public class AgathaChristieBook extends Book {
    String name;



    public AgathaChristieBook(String name) {
        super("Agatha Christie");
        this.name = name;
    }

    @Override
    AgathaChristieBook getBook() {
        return this;
    }

    @Override
    String getName() {
        return name;
    }
}
