package com.company.Javarush;

/**
 * Created by ПК on 11.01.2017.
 */
/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/
public class Initialize {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

    }
    static class Cat{
        String name;
        int weight = 6;
        int age = 5 ;
        String color;
        String adress;
        public void initialize(String name) {
            this.name = name;
        }






        public void initialize(String name, int weight, int age ) {
            this.name = name;
            this.weight = weight;
            this.age= age;


        }
        public void initialize(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }



        public void initialize(String name, int weight, String color, String adress,int age ){
            this.name = name;
            this.age = age;
            this.weight =weight;
            this.color = color;
            this.adress = adress;






        }
        public void initialize(int weight, String color, String adress ) {
            this.weight =weight;
            this.color = color;
            this.adress = adress;
        }



    }


    }


