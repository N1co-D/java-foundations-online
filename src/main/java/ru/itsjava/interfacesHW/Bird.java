package ru.itsjava.interfacesHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bird implements Walkable, Runnable, Swimable, Flyable {
    private int maxRunDistance;
    private int maxSwimSpeed;
    private String flyMaxDistance;

    @Override
    public void run() {
        System.out.println("Быстро бегаю при необходимости!");
    }

    @Override
    public int maxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public void swim() {
        System.out.println("Люблю плавать в жаркую пору!");
    }

    @Override
    public double maxSwimSpeed() {
        return maxSwimSpeed;
    }

    @Override
    public void walk() {
        System.out.println("Гуляю и корм птенцам собираю!");
    }

    @Override
    public void fly() {
        System.out.println("Весь день кружу в небесах!");
    }

    @Override
    public String flyMaxDistance() {
        return flyMaxDistance;
    }
}
