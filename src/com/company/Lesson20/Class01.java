package com.company.Lesson20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 21.11.2016.
 */
/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/
public class Class01 {
    public static char[] vowelsChar = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String s = reader.readLine();
        char[] chars = s.toCharArray ();
        String vowels = "";
        String consonants = "";
        for (int i = 0; i <chars.length ; i++) {
            if(isVowel (chars[i]))
                vowels = vowels + chars[i] + " ";
            else
                consonants += chars[i] + " ";

        }

        System.out.println (vowels);
        System.out.println (consonants);


    }
    public static boolean isVowel(char c){
        for (char c1 : vowelsChar) {
            if( c == c1) return true;
        }
        return false;
    }





    // isVowel(char c) - true(vowel) - false(consonants) -> iter(vowels)
}

