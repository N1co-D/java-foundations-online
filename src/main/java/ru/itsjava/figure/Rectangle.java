package ru.itsjava.figure;

public class Rectangle extends Figure {
    private int firstSideLengthOfRectangle;
    private int secondSideLengthOfRectangle;

    public Rectangle(int firstSideLengthOfRectangle, int secondSideLengthOfRectangle) {
        this.firstSideLengthOfRectangle = firstSideLengthOfRectangle;
        this.secondSideLengthOfRectangle = secondSideLengthOfRectangle;
    }

    @Override
    void getFigureName() {
        System.out.println("Эта фигура - прямоугольник!");
    }

    public void printPerimeter() {
        int perimeter = (firstSideLengthOfRectangle + secondSideLengthOfRectangle) * 2;
        System.out.println("Периметр прямоугольника = " + perimeter);
    }

    public void printArea() {
        int area = firstSideLengthOfRectangle * secondSideLengthOfRectangle;
        System.out.println("Площадь прямоугольника = " + area);
    }

}

