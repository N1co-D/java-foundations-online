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

//    public int checkingAge(int age) {
//        if (age < 0 || age > 150) {
//            try {                                                                любой код,  который может выкинуть exception
//                return age / 0;
//            } catch (ArithmeticException arithmeticException) {
//                throw new AgeNotValidException("Неправильно указан возраст!");
//            }
//        } else {
//            return age;
//        }
//    }

    public int checkingAge(int age) throws AgeNotValidException { //обработка(try-catch) Exception происходит вне этого метода
        if (age < 0 || age > 150) {
            throw new AgeNotValidException("Неправильно указан возраст!");
        } else {
            return age;
        }
    }

}