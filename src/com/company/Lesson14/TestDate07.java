package com.company.Lesson14;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ПК on 31.10.2016.
 */
/* Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet  должен вернуть время его исполнения в миллисекундах.
[] - [] - [] - []
*/
public class TestDate07 {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(fill(new LinkedList())));
        System.out.println(getTimeMsOfGet(fill(new ArrayList())));
    }

    public static long getTimeMsOfGet( List array){
        Date date = new Date();
        get10000(array);
        Date date1 = new Date();
        long ms = date1.getTime() - date.getTime();

        return ms;
    }

    private static List fill(List list){
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }
    
    public static void get10000 (List array){
        if(array.isEmpty()) return;
        int x = array.size()/2;
        for (int i = 0; i < 10000; i++) {
            array.get(x);
        }
    }

}
