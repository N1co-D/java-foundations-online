package ru.itsjava.figure;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void getFigureName() {
        System.out.println("Эта фигура - круг/окружность!");
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
