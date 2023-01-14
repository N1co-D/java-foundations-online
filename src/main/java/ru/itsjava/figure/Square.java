package ru.itsjava.figure;

public class Square extends Figure {
    private int sideLengthOfSquare;

    public Square(int sideLengthOfSquare) {
        this.sideLengthOfSquare = sideLengthOfSquare;
    }

    @Override
    void getFigureName() {
        System.out.println("Эта фигура - квадрат!");
    }

    public void printPerimeter() {
        int perimeter = sideLengthOfSquare * 4;
        System.out.println("Периметр квадрата = " + perimeter);
    }

    public void printArea() {
        int area = sideLengthOfSquare * sideLengthOfSquare;
        System.out.println("Площадь квадрата = " + area);
    }

}

