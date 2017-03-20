package com.company.Lesson12;

/**
 * Created by ПК on 24.10.2016.
 */
/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/
public class Class7 {
    public static void main(String[] args) {
        Human gFather1 = new Human("дед Иван", false, 68, null, null );
        Human gFather2 = new Human("дед Коля", false, 66, null, null );
        Human gMother1 = new Human("баба Валя", true, 60, null, null );
        Human gMother2 = new Human("баба Вера", true, 68, null, null );
        Human father = new Human("папа Саша", false, 38, gFather1, gMother1);
        Human mother = new Human("маам Оля", true, 35, gFather2, gMother2 );
        Human child1 = new Human("ребенок дима", false, 10, father, mother);
        Human child2 = new Human("ребенок Коля", false, 10, father, mother);
        Human child3 = new Human("ребенок Федя", false,10, father, mother);

        System.out.println(gFather1);
        System.out.println(gMother1);
        System.out.println(gFather2);
        System.out.println(gMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human (String s, boolean a, int b, Human c, Human d){
            this.name = s;
            this.sex = a;
            this.age = b;
            this.father = c;
            this.mother = d;
        }



        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;

//            if(this.sex == true) text += ", пол: женский" ;
//            else text += ", пол: мужской" ;

            text += ", пол: " + (this.sex ? "женский" : "мужской");

            text += ", возраст: " + this.age;

            if (this.father != null) text += ", отец: " + this.father.name;
            if (this.mother != null) text += ", мать: " + this.mother.name;


            return text;
        }
    }
}
