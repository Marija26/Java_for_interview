package com.company.Lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*Удаление всех чисел больше/ Создайте массив, введите с клавиатуры числа и заполните ими массив.
Далее, при помощи цикла, удалите все числа больше 5 с вашего массива.
 */
public class Homework {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> ar = new ArrayList<>();

        while(true){
            String s = reader.readLine();
            if (s.isEmpty()) break;
            ar.add(Integer.parseInt(s));
        }


        for (int i = 0; i < ar.size(); i++) {
            if( ar.get(i) > 5){
                ar.remove(i);
            }
        }




        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
    }


}


