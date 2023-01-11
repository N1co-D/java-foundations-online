package ru.itsjava.interfacesHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Fish implements Swimable {
    private double maxSwimSpeed;

    @Override
    public void swim() {
        System.out.println("Плаваю как рыба в воде!");
    }

    @Override
    public double maxSwimSpeed() {
        return maxSwimSpeed;
    }
}
