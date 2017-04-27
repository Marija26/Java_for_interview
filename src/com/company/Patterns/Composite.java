package com.company.Patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Маша on 23.04.2017.
 */
public class Composite {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Composite_ c = new Composite_();
        Composite_ c1 = new Composite_();
        Composite_ c2 = new Composite_();

        c1.addComposite(circle);
        c1.addComposite(triangle);
        c2.addComposite(square);

        c.addComposite(c1);
        c.addComposite(c2);
        c.removeComponents(c2);
        c.draw();
    }
}


interface Shape {
    void draw();
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Im a square");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Ima triangle");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Im a circle");
    }
}

class Composite_ implements Shape {
    private List<Shape> components = new ArrayList<>();

    void addComposite(Shape component) {
        components.add(component);
    }

    public void removeComponents(Shape component) {
        components.remove(component);
    }

    @Override
    public void draw() {
        for (Shape component : components) {
            component.draw();

        }

    }
}
