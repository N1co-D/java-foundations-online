package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Watch {
    private final String model;
    private String author;
    private double price;
}
