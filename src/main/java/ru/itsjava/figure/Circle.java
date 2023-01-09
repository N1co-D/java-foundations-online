package ru.itsjava.figure;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void printPerimeter() {
        double perimeter = 2 * PI * radius;
        System.out.println("Периметр круга = " + perimeter);
    }

    public void printArea() {
        double area = PI * radius*radius;
        System.out.println("Площадь круга = " + area);
    }


}
