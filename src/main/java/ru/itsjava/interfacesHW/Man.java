package ru.itsjava.interfacesHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Man implements Walkable, Runnable, Swimable {
    private int maxRunDistance;
    private int maxSwimDistance;

    @Override
    public void run() {
        System.out.println("Я люблю бегать по утрам!");
    }

    @Override
    public int maxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public void walk() {
        System.out.println("Предпочитаю гулять по вечерам!");
    }

    @Override
    public void swim() {
        System.out.println("Я плаваю в бассейне!");
    }

    @Override
    public double maxSwimSpeed() {
        return maxSwimDistance;
    }
}
