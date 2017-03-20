package com.company.OOP.Task11;

import javafx.collections.transformation.FilteredList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 23.01.2017.
 */
/* ООП
1. Создать интерфейс Alive с методом Object containsBones().
2. Создать класс BodyPart, который реализует интерфейс Alive.
2.1 Создать приватную переменную name и сделать конструктор для инициализации.
2.2 Метод containsBones должен возвращать тип Object и значение "Yes"
2.3 Переопределить метод toString(), он должен возвращать name + " содержит кости", если containsBones().equals("Yes") возвращает true,
или он должен возвращать name + " не содержит кости", если containsBones().equals("Yes") возвращает false.
3. Создать класс Finger, который наследуется от класса BodyPart.
3.1 Создать приватную переменную boolean isFoot (это стопа?), переопределить конструктор супер-класса, добавить инициализацию
переменной isFoot
3.2 Переопределить метод containsBones, он должен возвращать тип Object и значение "Yes" вместо true,
если super.containsBones().equals("Yes") && !isFoot, или "No" вместо false
4. Создать метод printlnBodyParts():
- В методе создать список частей тела, добавить в этот список 4 объекта BodyPart (Рука, Нога, Голова, Тело)
- Вывести на экран каждый объект
5. Создать метод printlnFingers():
- В методе создать список пальцев, добавить в этот список 5 объектов Finger
(Большой - рука, Указательный - рука, Средний - стопа, Безымянный - стопа, Мезинец - рука)
- Вывести на экран каждый объект
6. Вызвать методы в main.
*/
public class Task11 {
    public static void main(String[] args) {

        printlnBodyParts();
        printlnFingers();

    }


   public static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<> ();
        bodyParts.add (new BodyPart ("Hand"));
        bodyParts.add (new BodyPart ("Head"));
        bodyParts.add (new BodyPart ("Leg"));
        bodyParts.add (new BodyPart ("Body"));
       System.out.println (bodyParts);

    }
    public static void printlnFingers(){
        List<Finger> finger = new ArrayList<> ();
        finger.add (new Finger("Большой", false));
        finger.add(new Finger ("Указательный", false));
        finger.add(new Finger ("Средний", true));
        finger.add(new Finger ("Безымянный", true));
        finger.add(new Finger ("Мезинец", false));
        System.out.println (finger);

    }

}
