package com.company.Lesson19;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ПК on 17.11.2016.
 */
/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь MapCat(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из MapCat множество(Set) всех имен и вывести его на экран.
*/
public class Test08 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }
    public static Map createMap(){
        Map<String, Cat> map = new HashMap<> ();
        map.put("Вася", new Cat ("Вася"));
        map.put("Петя", new Cat ("Петя"));
        map.put("Оля", new Cat ("Оля"));
        return map;
    }
    public static Set convertMapToSet(Map<String, Cat> map){
        Set<Cat> cat = new HashSet<> ();
        for (Map.Entry<String, Cat> pair : map.entrySet ()) {
        Cat a = pair.getValue();
            cat.add(a);

        }
        return  cat;
        // iter (map) -> getValue -> add

    }
    public static void printCatSet(Set<Cat> set){
        for (Cat cat : set) {
            System.out.println(cat);

        }
    }

    

    public static class Cat{
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }

    }

}
