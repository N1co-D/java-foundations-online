package ru.itsjava.statics.object;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PhoneLombok {
    private final String model;
    private int storage;
    private boolean modul5G;
    private boolean nfc;
}
