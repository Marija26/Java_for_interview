package com.company.Lesson15;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by ПК on 03.11.2016.
 */
/* Удалить всех людей, родившихся летом
Создать словарь (MapCat<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/
public class Test03 {
    public static void main(String[] args) {
        Map<String, Date> map = createMap ();
        removeAllSummerPeople(map);
        System.out.println (map);
    }



    private static Map createMap(){
        Map< String, Date> map = new HashMap<> ();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 5 1999"));
        map.put("Stallone2", new Date("JUNE 13 1996"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("AUGUST 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JULY 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("DECEMBER 1 1980"));
        map.put("Stallone9", new Date("MARCH 1 1980"));

        return map;
    }

    public static void  removeAllSummerPeople(Map<String, Date> map ){
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet ().iterator ();
        while (iterator.hasNext ()){
            Map.Entry<String, Date>pair = iterator.next ();
            int month = pair.getValue ().getMonth () + 1;
            if (month >=6 && month <= 8) iterator.remove ();
        }
    }

}
