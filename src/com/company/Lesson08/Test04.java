package com.company.Lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by ПК on 26.09.2016.
 */
/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>a = new ArrayList<>();

        for (int i = 0; i < 5 ; i++) {
            a.add(reader.readLine());
        }

        int maxLength = a.get(0).length(); // a[0].length();
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).length() < maxLength){
                maxLength = a.get(i).length();
            }
        }
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).length() == maxLength ){
                System.out.println(a.get(i));
            }

        }


    }
}
