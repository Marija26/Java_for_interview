package com.company.Lesson16;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ПК on 07.11.2016.
 */
/*
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/
public class Test02 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();
        Set<Object> pets = join(cats, dogs);
        removeCats(pets, cats);
        printPets(pets);
    }

    public static void printPets(Set<Object> pets){
        System.out.println (pets);
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats){
        pets.removeAll (cats);
    }

    public static Set<Object> join(Set<Cat> cat, Set<Dog> dog){
        Set<Object> pets = new HashSet<> ();
        pets.addAll (cat);
        pets.addAll (dog);
        return pets;
    }

    public static Set<Cat> createCats(){
        Set<Cat> cat = new HashSet<> ();
        cat.add(new Cat());
        cat.add(new Cat());
        cat.add(new Cat());
        cat.add(new Cat());
        return cat;
    }

    public static Set<Dog> createDogs(){
        Set<Dog> dog = new HashSet<> ();
        dog.add(new Dog());
        dog.add(new Dog());
        dog.add(new Dog());

        return dog;
    }




    public static class Cat{}
    public static class Dog{}


}
