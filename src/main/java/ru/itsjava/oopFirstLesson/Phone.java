package ru.itsjava.oopFirstLesson;

public class Phone {
    private final String brand;
    private boolean isHomey;

    public Phone(String brand) {
        this.brand = brand;
    }

    public Phone(String brand, boolean isHomey) {
        this.brand = brand;
        this.isHomey = isHomey;
    }

    public String toString() {
        return "{" + brand + " " + isHomey + "}";
    }

}
