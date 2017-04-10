package com.company.Lesson_Threads.Test_20;

/**
 * Created by Маша on 10.04.2017.
 */
/* Thread.currentThread - всегда возвращает текущую нить
1. В выполнящем классе создать статическую переменную int count = 5
2. Создать вложенный класс NameOfDefferentThreads, который наследуется от Thread
3. В классе NameOfDefferentThreads реализовать метод printMsg:
- в методе printMsg создать переменную t, она должна хранить состояние текущей нити, подумать какой тип данной переменной
- в методе printMsg присвой переменной t текущую нить.
- в методе printMsg создать переменную name и присвоить ей имя нити, которая находится в переменной t
- в методе printMsg после всех действий поставь задержку в 1 миллисекунду.
3.1 Реализовать метод run(), он должен вызывать метод printMsg, count раз
4. В выполняющем методе:
- создать нить класса NameOfDefferentThreads и запустить её
- вызвать метод printMsg(), count раз
*/
public class MyThread {
    static int count = 5;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new NameOfDefferentThreads();
        thread.start();
        NameOfDefferentThreads n =new NameOfDefferentThreads();
        for (int i = 0; i <count ; i++) {
            n.printMsg();
        }



    }
}
