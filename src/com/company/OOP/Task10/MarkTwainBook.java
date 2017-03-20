package com.company.OOP.Task10;

/**
 * Created by ПК on 19.01.2017.
 * JDK(javac, lib) -> JRE -> JVM
 */
public class MarkTwainBook extends Book {
    String name;

    public MarkTwainBook(String name) {
        super ("MarkTwain");
        this.name = name;
    }

    @Override
    MarkTwainBook getBook() {
        return this;
    }

    @Override
    String getName() {
        return name;
    }
}
