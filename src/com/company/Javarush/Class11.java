package com.company.Javarush;

/**
 * Created by ПК on 24.10.2016.
 */
/* По 50 000 объектов Cat и Dog
Создать в цикле по 50 000 объектов Cat и Dog. (Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
*/
public class Class11 {

    public static void main(String[] args)
    {
        for (int i = 0; i <50000 ; i++) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        }

    }
}
class Cat
{

    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Cat destroyed");
    }
}

class Dog
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Dog destroyed");
    }
}


