package com.company.Lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/
public class Class3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true){
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);

        }
        List<String>list1 = new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            String x = list.get(i);
            if (x.length() % 2 ==0)
                list1.add(x + " " + x);
            else
                list1.add(x + " " + x + " " + x);


        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }
    }
}
