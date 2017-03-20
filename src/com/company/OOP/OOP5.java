package com.company.OOP;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ПК on 08.12.2016.
 */
/*
Создать 2 класса Сow и Whale.
В классе Cow создать метод getName(), который возвращает строку "Я - корова".
Унаследовать Whale от Cow
Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:
Я не корова, Я - кит.
*/
public class OOP5 {
    public static void main(String[] args) {
        Cow whale = new Whale();
        Cow cow = new Cow();
        System.out.println (cow.getName ());
    }

    public static class Cow{

        public String getName(){
            return "Я - корова";
        }

    }
    public static class Whale extends Cow{

        @Override
        public String getName() {
            return "Я не корова, я кит";
        }
    }
}
