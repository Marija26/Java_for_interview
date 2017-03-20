package com.company.OOP;

/**
 * Created by ПК on 08.12.2016.
 */
 /*
    Создать интерфейс Drink и класс AlcoholicBeer
    В интерфейсе Drink создай метод isAlcoholic();
    Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все нереализованные методы.
    Метод  toString в классе AlcoholicBeer должен выводить на экран "Напиток алкогольный", если isAlcoholic() возвращает true,
    иначе вывести на экран надпись "Напиток безалкогольный".
    */
public class OOP9 {
    public static void main(String[] args) {
        Drink alco = new AlcoholicBeer ();
        System.out.println (alco);
    }

    public interface Drink {
        boolean isAlcoholic();

    }
    public static class AlcoholicBeer implements Drink{

        @Override
        public boolean isAlcoholic() {
           return true;
        }

        @Override
        public String toString() {
            String text = " ";
            if (isAlcoholic () == true) text+= "Напиток алкогольный";
            else text+= "Напиток безалкогольный";
           return text;
        }
    }
}
