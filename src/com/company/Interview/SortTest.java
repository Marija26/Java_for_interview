package com.company.Interview;

import com.company.Javarush.CyclaFor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Маша on 29.05.2017.
 */
/*Задание Задан массив, элементами которого являются произвольные целые числа.
Необходимо         определить (максимально оптимальным образом) элемент с индексом k для массива,
состоящего из таких же чисел, но отсортированного по возрастанию. Например, для
 массива   [6,   1,   4,   1,   7]   и   k=3   правильным   ответом   будет   число   4   ([1,   1,   4,   6,   7]).
 Входные   данные Массив   произвольных   целых   чисел   и   натуральное   число   k   (1   <=   k   <=   длина   массива).
   Выходные   данные k-й элемент массива, состоящего из таких же чисел, как и исходный массив, но
     отсортированного   по   возрастанию.

     n 1 100
     fizz n 3
     bus n 5
     fizzbus n 3 5
     n

      for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("fizz");
            else if (i % 5 == 0) System.out.println("bus");
            else if (i % 3 == 0) System.out.println("fizzbus");
            else System.out.println(i);
        }

     String s = "((() (( ( ))";
     ((() - true
     ( )) - false
     ( - true
     ) - false
 */

public class SortTest {
    int age;
    String name;

    public static void main(String[] args) {
        int[] a = {6, 1, 4, 1, 7};
        int k = 3;
        Map<SortTest, String> map = new HashMap();
        SortTest s = new SortTest();
        s.met1();
    }



    void met1(){
        CyclaFor cyclaFor = new CyclaFor();
        cyclaFor.met();
    }

    public static int sort(int[] s, int k) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SortTest sortTest = (SortTest) o;

        if (age != sortTest.age) return false;
        return name != null ? name.equals(sortTest.name) : sortTest.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

interface Test {
    void m1();

    static void m(){
        System.out.println("f");
    }

    default void test() {
        System.out.println("m");
    }

}
