package ru.itsjava.interfacesHW2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cow implements Talkable, Eatable {
    private final String name;

    @Override
    public void talk() {
        System.out.println("Му-у!");
    }

    @Override
    public void eat() {
        System.out.println("Люблю жевать траву!");
    }
}
