package com.company.Javarush;

/**
 * Created by ПК on 11.01.2017.
 */
/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/
public class Initialize2 {
    public static void main(String[] args) {

    }

    class Rectangle {
        int left, top, width, height;

        public void initilize(int left, int top, int width, int height) {
            this.left = left;
            this.top = top;

        this.width =width;
            this.height = height;}

        public void initilize(int left, int top) {
            this.left = left;
            this.top = top;

        }

        public void initilize(int width, int top, int left) {
            this.width = width;
            this.top = top;
            this.left = left;




        }

        public void initialize(Rectangle rectangle) {
            this.width = rectangle.width;
            this.left = rectangle.left;
            this.height = rectangle.height;
            this.top = rectangle.top;
        }
    }
}
