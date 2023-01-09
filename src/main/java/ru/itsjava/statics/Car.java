package ru.itsjava.statics;

import lombok.Data;

@Data
public class Car {
    private final String model;
    private String colour;
//    private double price;
    private static double price;

    public Car(String model, String colour, double price) {
        this.model = model;
        this.colour = colour;
        this.price = price;
    }
}
