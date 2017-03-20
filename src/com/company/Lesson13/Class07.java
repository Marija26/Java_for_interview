package com.company.Lesson13;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ПК on 27.10.2016.
 */
/* Коллекция HashMap из котов
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
*/
public class Class07 {
    public static void main(String[] args) {
        String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        Map<String, Cat> map = addcatsToMap(cats);

        for (Map.Entry<String, Cat> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static Map<String, Cat> addcatsToMap(String[] cats){
        Map<String, Cat> map = new HashMap<>();
        for (String s : cats) {
            map.put(s, new Cat(s));
        }
        return map;
    }

    public static class Cat{
        String name;
        Cat(String n){
            this.name = n;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
