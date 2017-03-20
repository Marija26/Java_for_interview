package com.company.Lesson14;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ПК on 31.10.2016.
 */
/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
*/
public class TestDate06 {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new LinkedList()));
        System.out.println(getTimeMsOfInsert(new ArrayList()));
    }

    public static long getTimeMsOfInsert(List list) {
        Date date = new Date();
        insert(list);
        Date date1 = new Date();
        long ms = date1.getTime() - date.getTime();

        return ms;
    }


    public static void insert(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(0, new Object());
        }
    }

}
