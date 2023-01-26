package ru.itsjava.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Phone {
    private final String model;
    private int price;
}
