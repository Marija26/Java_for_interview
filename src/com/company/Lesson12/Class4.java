package com.company.Lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 24.10.2016.
 */
/* Нужно исправить программу, чтобы компилировалась и работала
Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран.
Ввод продолжается, пока переменная с именем не пуста. Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/
public class Class4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Cat> cats = new ArrayList<>();

        while(true) {
            String name = reader.readLine();
            if (name.isEmpty())break;
            int age = Integer.parseInt(reader.readLine());
            int weight = Integer.parseInt(reader.readLine());
            int tail = Integer.parseInt(reader.readLine());

            Cat cat = new Cat(name, age, weight, tail);
            cats.add(cat);
        }

        for (int i = 0; i <cats.size() ; i++) {
            System.out.println(cats.get(i));

        }

    }

    public static class Cat{
        String name;
        int age;
        int weight;
        int tail;

        public Cat(String name, int age, int weight, int tail) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tail = tail;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    ", tail=" + tail +
                    '}';
        }
    }

}
