package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 07.11.2016.
 */
/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Array09 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        List<String> list = new ArrayList<> ();
        for (int i = 0; i <5 ; i++) {
           list.add(reader.readLine());


        }
        int min = list.get(0).length ();
        for (int i = 0; i <5 ; i++) {
            if(min > list.get(i).length ())
                System.out.println (list.get(i).length ());


        }
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).length () == min )
                System.out.println (list.get (i));

        }

    }

}
