package ru.itsjava.figure;

public class Main {
    public static void main(String[] args) {

        Figure triangle = new Triangle(3, 4, 5);
        triangle.printPerimeter();
        triangle.printArea();

        System.out.println();

        Figure rectangle = new Rectangle(1, 5);
        rectangle.printPerimeter();
        rectangle.printArea();

        System.out.println();

        Figure square = new Square(3);
        square.printPerimeter();
        square.printArea();

        System.out.println();

        Figure circle = new Circle(5);
        circle.printPerimeter();
        circle.printArea();

    }
}
