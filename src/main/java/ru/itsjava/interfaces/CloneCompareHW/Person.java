package ru.itsjava.interfaces.CloneCompareHW;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable {
    private String name;
    private final String surname;
    private double age;

    @Override
    public int compareTo(Person person) {
        int surnameResult = surname.compareTo(person.surname);
        int nameResult = name.compareTo(person.name);
        if (surnameResult == 0) {
            if (nameResult == 0) {
                return (int) (age - person.age); // ФИ у людей одинаковые, производим сравнение по возрасту. Если возвращается 0, значит сравниваются одинаковые люди
            } else {
                return nameResult;
            }
        } else {
            return surnameResult;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person {" + name + " " + surname + ", " + (int) age + "}";
    }

}
