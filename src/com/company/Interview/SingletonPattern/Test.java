package com.company.Interview.SingletonPattern;

/**
 * Created by ПК on 28.12.2016.
 */
/* Test
Класс является синглтоном (реализует паттерн(шаблон) Test), если позволяет создать всего один объект своего типа.

Реализовать Test pattern:
1. Создай класс Test в отдельном файле.
2. Добавь в него статический метод getInstance().
3. Метод getInstance должен возвращать один и тот же объект класса Test при любом вызове метода getInstance.
4. Подумай, каким образом можно запретить создание других объектов этого класса.
5. Сделай все конструкторы в классе Test приватными (private).

6. В итоге должна быть возможность создать объект (экземпляр класса) ТОЛЬКО используя метод getInstance.
*/
public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance ();
        Singleton singleton1 = Singleton.getInstance ();
        Singleton singleton2 = Singleton.getInstance ();
        Singleton singleton3 = Singleton.getInstance ();
        System.out.println (singleton);
        System.out.println (singleton1);
        System.out.println (singleton2);
        System.out.println (singleton3);
    }

}

