package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 07.11.2016.
 */
/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/
public class Array12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        List<String> list = new ArrayList<> ();
        for (int i = 0; i <5 ; i++) {
            list.add(reader.readLine ());

        }
        list.remove (2);
        for (int i = 0; i <list.size () ; i++) {
            int j = list.size() -1 - i;

            System.out.println (list.size() -1 - i );

        }

    }
}
