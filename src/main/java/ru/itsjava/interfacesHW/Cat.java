package ru.itsjava.interfacesHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cat implements Walkable, Runnable {
    private int maxRunDistance;

    @Override
    public void run() {
        System.out.println("Бегаю за мышами!");
    }

    @Override
    public int maxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public void walk() {
        System.out.println("Люблю гулять по крышам!");
    }
}
