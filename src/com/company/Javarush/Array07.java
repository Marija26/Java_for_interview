package com.company.Javarush;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 06.11.2016.
 */
/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Array07 {
    public static void main(String[] args) {
       String[]list = new String[5];
        list[0] = "Mama";
        list[2] = "dfg";
        list[3] = "dfwg";
        list[4] = "dfsg";
        list[1] = "dfxg";
        System.out.println (list.length);

        for (int i = 0; i <list.length ; i++) {
            System.out.println (list[i]);

        }

    }

}
