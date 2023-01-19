package ru.itsjava.collections.lists.HW;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private final String name;
    private final String author;
    private final int pages;
}
