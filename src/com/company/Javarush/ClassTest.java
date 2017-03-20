package com.company.Javarush;

/**
 * Created by ПК on 11.01.2017.
 */
/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/
public class ClassTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat",2, 5, 8);
        Cat cat2 = new Cat("Cat1",2, 6, 8);





    }
    static class Cat{
        String name;
        int age;
        int weight;
        int strength;
        Cat(String name, int age, int weight, int strenght){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strenght;


        }
        public boolean fight(Cat anotherCat){
            if(this.strength >anotherCat.strength)
                return true;
            else return false;



        }


    }

}
