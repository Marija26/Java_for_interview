package com.company.Javarush;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ПК on 09.11.2016.
 */

/* Вывести на экран список ключей
Есть коллекция HashMap<String, String>, туда занесли 10 различных строк. Вывести на экран список ключей, каждый элемент с новой строки.
*/
public class Array19 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }
    public static void printKeys(Map<String, String> map){
        for (String s : map.keySet ()) {
            System.out.println (s);

        }
        }


        }













