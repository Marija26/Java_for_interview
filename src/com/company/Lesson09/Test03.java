package com.company.Lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 29.09.2016.
 */

    /* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк.
Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> arr = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            arr.add(reader.readLine());
        }
        arr.remove(2);
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println(arr.get(i));
        }

    }





}
