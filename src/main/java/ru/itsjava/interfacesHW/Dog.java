package ru.itsjava.interfacesHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dog implements Walkable, Runnable, Swimable {
    private int maxRunDistance;
    private int maxSwimDistance;

    @Override
    public void run() {
        System.out.println("Я люблю бегать за мячиком!");
    }

    @Override
    public int maxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public void walk() {
        System.out.println("Часто гуляю с хозяином");
    }

    @Override
    public void swim() {
        System.out.println("Плаваю на озере!");
    }

    @Override
    public double maxSwimSpeed() {
        return maxSwimDistance;
    }



}
