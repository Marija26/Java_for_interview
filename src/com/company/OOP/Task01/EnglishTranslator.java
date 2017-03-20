package com.company.OOP.Task01;

/**
 * Created by ПК on 12.12.2016.
 */
public class EnglishTranslator extends Translate{
    String name;

    public EnglishTranslator(String name) {
        this.name = name;
    }

    @Override
    String getLanguage() {
        return " английского.";
    }
}
