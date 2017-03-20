package com.company.Lesson16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by ПК on 07.11.2016.
 */
/* Set из котов
1. Внутри класса создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/
public class Test01 {
    static Cat cat1 = new Cat ();
    static Cat cat2 = new Cat ();
    static Cat cat3 = new Cat ();
    public static void main(String[] args) {
        Set<Cat> cats = createSet();
        Iterator<Cat> iterator = cats.iterator ();
        while(iterator.hasNext ()){
            if(iterator.next ().equals (cat2)) iterator.remove ();
        }

        for (Cat cat : cats) {
            System.out.println (cat);
        }
    }
    public static Set createSet(){
        Set<Cat> cat = new HashSet<> ();
        cat.add(cat1);
        cat.add(cat2);
        cat.add(cat3);

        return cat;
    }

    public static class Cat{}


}
