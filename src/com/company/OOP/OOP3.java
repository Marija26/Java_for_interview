package com.company.OOP;

/**
 * Created by ПК on 05.12.2016.
 */
/* Лошадь и пегас
Написать два класса: Horse (лошадь) и Pegas (пегас).
В классе Horse создать переменные name, flyable, runnable
Созать конструктор для всех переменных класса Horse
В классе Horse создать метод, который проверяет переменную flyable и выводит на экран следующее:
- если переменная true, My name is + this.name + , i can fly =)
- если переменная false, My name is + this.name + , i cant fly =(
Унаследовать пегаса от лошади.
В методе main создать два объекта: horse и pegas
Подумать, какие значения присваивать переменным определенного класса.
*/
public class OOP3 {
    public static void main(String[] args) {
        Horse horse = new Horse ("Petya", false, true);
        Pegas pegas = new Pegas ("Vasia", true, true);
        horse.chechHorse ();
        pegas.chechHorse ();

    }
    public static class Horse{
        private String name;
        private boolean flyable;
        private boolean runnable;

        Horse(String name, boolean flyable, boolean runnable){
            this.name =  name;
            this.runnable = runnable;
            this. flyable = flyable;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isFlyable() {
            return flyable;
        }

        public void setFlyable(boolean flyable) {
            this.flyable = flyable;
        }

        public boolean isRunnable() {
            return runnable;
        }

        public void setRunnable(boolean runnable) {
            this.runnable = runnable;
        }

        public void chechHorse(){
            if(flyable) System.out.println ("My name is  " + this.name + " I can fly :)" );
            else System.out.println ("My name is  " + this.name + " I cant fly :(");
        }

    }
    public static class Pegas extends Horse{
        Pegas(String name, boolean flyable, boolean runnable) {
            super (name, flyable, runnable);
        }
    }
}
