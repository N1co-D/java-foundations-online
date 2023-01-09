package ru.itsjava.figure;

public class Triangle extends Figure {
    private int firstSideLengthOfTriangle;
    private int secondSideLengthOfTriangle;
    private int thirdSideLengthOfTriangle;

    public Triangle(int firstSideLengthOfTriangle, int secondSideLengthOfTriangle, int thirdSideLengthOfTriangle) {
        this.firstSideLengthOfTriangle = firstSideLengthOfTriangle;
        this.secondSideLengthOfTriangle = secondSideLengthOfTriangle;
        this.thirdSideLengthOfTriangle = thirdSideLengthOfTriangle;
    }

    public void printPerimeter() {
        int perimeter = firstSideLengthOfTriangle + secondSideLengthOfTriangle + thirdSideLengthOfTriangle;
        System.out.println("Периметр треугольника = " + perimeter);
    }

    public void printArea() {
        double halfPerimeter = (firstSideLengthOfTriangle + secondSideLengthOfTriangle + thirdSideLengthOfTriangle) / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - firstSideLengthOfTriangle) * (halfPerimeter - secondSideLengthOfTriangle) * (halfPerimeter - thirdSideLengthOfTriangle));
        System.out.println("Площадь треугольника = " + area);

    }
}

