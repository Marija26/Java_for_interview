package com.company.OOP.Task7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 12.01.2017.
 */
/* Валюты
1. Создать абстрактный класс Money
1.0 Реализуй метод getAmount в классе Money:
1.1. Подумай, какого типа нужно создать приватную переменную, если метод getAmount будет ее возвращать.
1.2. Создай приватную переменную этого типа и верни ее в методе getAmount.
1.3. В конструкторе присвой ей значение, полученное параметром.
1.4. Создай абстрактный метод    String getCurrencyName();
2. В отдельном файле создай класс Hrivna.
3. Наследуй класс Hrivna от класса Money.
4. В классе Hrivna реализуй метод getCurrencyName, который возвращает "HRN".
5. В отдельном файле создай класс USD.
6. Наследуй класс USD от класса Money.
7. В классе USD реализуй метод getCurrencyName, который возвращает "USD".
8. В выполняющем классе Solution создать вложенный класс Person:
8.1 Создать во вложенном классе 2 переменные: name - имя, allMoney - список со всей валютой у объекта.
8.2 В конструкторе присвой значение name, полученное параметром.
8.3 Подумай, объекты каких классов можно добавить в список(лист) allMoney.
8.4 Добавь в конструктор класса Person заполнение листа allMoney объектами всех возможных классов.
9. В выполняющем методе создать объект с типом Person.
10. Вывести на экран надпись типа - person.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName()
*/
public class Money {
    public static void main(String[] args) {
        Person person = new Person ("Иван", 5, 6);

        for (Money1 money1 : person.allMoney) {
           // money1.setAmount (4343);
            System.out.println (person.name + " имеет заначку в размере " + money1.getAmount () + " " + money1.getCurrencyName ());
        }
    }


   static class Person {
        String name;
        List<Money1> allMoney;

        Person(String name, int a, int b) {
            this.name = name;
            this.allMoney = new ArrayList<> ();
            allMoney.add (new Hrivna (a));
            allMoney.add (new USD (b));

        }


    }
}






