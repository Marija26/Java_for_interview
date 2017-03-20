package com.company.OOP.Task01;

/*
1. Создать класс EnglishTranslator, который наследуется от абстрактного класса Translator.
   В классе Translator создать абстрактный метод getLanguage() и не абстрактный метод
    public String translate(), который возвращает строку "Я переводчик с " + getLanguage();
2. Реализовать все абстрактные методы.
3. Подумай, что должен возвращать метод getLanguage.
4. Программа должна выводить на экран "Я переводчик с английского".
5. Создать класс GermanyTranslator, который наследуется от абстрактного класса Translator.
6. Реализовать все абстрактные методы.
7. Подумай, что должен возвращать метод getLanguage.
8. Программа должна выводить на экран "Я переводчик с немецкого".
*/

public class Test01 {
    public static void main(String[] args) {
        EnglishTranslator englishTranslator = new EnglishTranslator ("Vasya");
        EnglishTranslator englishTranslator1 = new EnglishTranslator ("Kolya");
        GermanyTranslator germanyTranslator = new GermanyTranslator ();
        System.out.println (englishTranslator.translate ());
        System.out.println (germanyTranslator.translate ());

    }
}
