package ru.itsjava.interfacesHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bird implements Flyable {
    private String flyMaxDistance;

    @Override
    public void fly() {
        System.out.println("Весь день кружу в небесах!");
    }

    @Override
    public String flyMaxDistance() {
        return flyMaxDistance;
    }
}
