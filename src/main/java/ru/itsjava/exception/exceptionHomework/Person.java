package ru.itsjava.exception.exceptionHomework;

import lombok.Data;

@Data
public class Person {
    private final String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = checkingAge(age);
    }

    public int checkingAge(int age) throws AgeNotValidException {
        if (age < 0 || age > 150) {
            try {
                return age / 0;
            } catch (ArithmeticException arithmeticException) {
                throw new AgeNotValidException("Неправильно указан возраст!");
            }
        } else {
            return age;
        }
    }
}