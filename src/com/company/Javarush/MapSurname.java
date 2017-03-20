package com.company.Javarush;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ПК on 19.12.2016.
 */
//Создать словарь (Map) занести в него десять записей по принципу «фамилия» - «имя».
//Удалить людей, имеющих одинаковые имена.

public class MapSurname {
    public static void main(String[] args) {
        Map<String, String >map = Names();

        remove1 (map);
        System.out.println (map);


    }



    public static Map Names(){
        Map<String, String> map = new HashMap<> ();
        map.put("Valia", "Matvienko");
        map.put("Valia", "Matvienkova");
        map.put("Valia", "Makvienko");
        map.put("Valia", "Matvienko");
        map.put("Valia", "Matvienkof");
        map.put("Valia", "Matvienkoff");
        map.put("Valia", "Matvienko");
        map.put("Valia", "Matvienkovich");
        map.put("Valia", "Matvienko");
        map.put("Valia", "Matvienkos");
        return map;

    }
    public static Map remove1(Map<String, String> map){
        Map<String, String >map1 = new HashMap<> (map);


        for (Map.Entry<String, String> pair : map.entrySet ()) {
            int count = 0;

            String key = pair.getKey ();
            String value = pair.getValue ();

            for (Map.Entry<String, String> pair1 : map1.entrySet ()) {


                String key1 = pair.getKey ();
                String value1 = pair.getValue ();
                if(value.equals (value1))count++;
        }
        if(count ==1)map1.put(key, value);


        }


        return map1;
    }
}
