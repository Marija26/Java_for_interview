package com.company.OOP.Task10;

/**
 * Created by ПК on 19.01.2017.
 */
public abstract class Book {
    private String author;

    public Book(String author) {
        this.author = author;
    }

    abstract Book getBook();

    abstract String getName();

    String getOutputByBookType() {
       String agathaChristieOutput = author + ", " + getBook ().getName () + " is a detective";
        String markTwainOutput = getBook ().getName () + " book was written by " + author;
        String output = "";

        if(this instanceof AgathaChristieBook) output = agathaChristieOutput;
        else if(this instanceof MarkTwainBook) output = markTwainOutput;
        return output;
    }

    @Override
    public String toString() {
        return getOutputByBookType();
    }


}



