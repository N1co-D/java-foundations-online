package ru.itsjava.statics;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Car {
    private final String model;
    private String colour;
    private static double price = 500_000;

    public static void setPrice(double price1){
        price1 = price;
    }

    public double getPrice(){
        return price;
    }

}
