package com.company.Interview.SingletonPattern;

import java.util.HashSet;
import java.util.Set;

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

        Set products = new HashSet();
        products.add(new Product("Hat",3));
        products.add(new Product("Hat",3));
        System.out.println(products);
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
    }
    public  static class Product {
        public Product(String title, int size){
            this.title = title;
            this.size = size;
        }
        String title;
        int size;

        public String toString()
        {
            return title + ":" + size;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Product product = (Product) o;

            if (size != product.size) return false;
            return title != null ? title.equals(product.title) : product.title == null;
        }

        @Override
        public int hashCode() {
            int result = title != null ? title.hashCode() : 0;
            result = 31 * result + size;
            return result;
        }
    }


}


