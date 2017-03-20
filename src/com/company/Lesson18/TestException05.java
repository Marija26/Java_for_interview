package com.company.Lesson18;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ПК on 14.11.2016.
 */
/* Исключение при работе с коллекциями MapCat
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
HashMap<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);
*/
public class TestException05 {
    public static void main(String[] args) {
        
        try{
            Map<String, String> map = new HashMap<>(null);
            map.put(null, null);
            map.remove(null);
            System.out.println (map);

        }catch (NullPointerException e){
            System.out.println (e);
        }




    }
}
