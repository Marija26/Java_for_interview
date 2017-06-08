package com.company.Javarush;


import javafx.scene.effect.SepiaTone;

import java.util.*;

/**
 * Created by ПК on 12.01.2017.
 */
/*
Есть класс Cat, с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
 */
public class Collection01 {
    public static void main(String[] args) throws InterruptedException {
        Date startTime = new Date();

        long endTime = startTime.getTime() + 5000;   //    +5 секунд
        Date endDate = new Date(endTime);

        Thread.sleep(3000);              // ждем 3 секунды

        Date currentTime = new Date();
        if (currentTime.after(endDate))//проверяем что время currentTime после endDate
        {
            System.out.println("End time!");
        }
    }
}

