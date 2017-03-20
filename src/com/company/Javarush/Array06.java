package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by ПК on 03.11.2016.
 *//* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/
public class Array06 {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = createMap ();
        searchMonth(map);
    }

    public static Map<String, Integer> createMap(){
        Map<String, Integer> myMap = new HashMap<> ();
        myMap.put("January", 1);
        myMap.put("February", 2);
        myMap.put("March", 3);
        myMap.put("April", 4);
        myMap.put("May", 5);
        myMap.put("June", 6);
        myMap.put("July", 7);
        myMap.put("August", 8);
        myMap.put("September", 9);
        myMap.put("October", 10);
        myMap.put("November", 11);
        myMap.put("December", 12);
        return myMap;
    }

    public static void searchMonth(Map<String, Integer> map) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt (reader.readLine ());
        for (Map.Entry<String, Integer> pair : map.entrySet ()) {
            Integer value = pair.getValue ();
            if( value == a)
                System.out.println (pair.getKey () + " is " + value + " month ");
        }

    }

}







