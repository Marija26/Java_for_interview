package com.company.Javarush;

import com.company.OOP.OOP3;

import java.math.BigDecimal;

/**
 * Created by ПК on 18.01.2017.
 */


/*1. Добавь интерфейсы Secretary и Boss к классам CleverMan и SmartGirl. По одному на каждый. Подумай, кому какой.
2. Унаследуй интерфейсы Secretary и Boss от интерфейсов Person и Workable так,
чтобы все методы у классов CleverMan и SmartGirl оказались объявленными в каком-то интерфейсе.*/
public class PetDogCat {

    public static void main(String[] args) {
    }


    public interface Person {
    }

    public interface Workable {
    }


    public interface Secretary {

    }

    public interface Boss {


    }
    class CleverMan implements Secretary, Boss{}
    class SmartGirl implements Secretary, Boss{}
}








