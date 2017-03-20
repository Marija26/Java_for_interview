package com.company.Javarush;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 08.11.2016.
 */
/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/
public class Array14 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<> ();
        list.add("мама именно");
        list.add("мама именно");
        list.add("мама именно");


        for (int i = 0; i <list.size () ; i++) {
            System.out.println (list.get (i));

        }
    }




}
