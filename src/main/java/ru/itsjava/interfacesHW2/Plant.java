package ru.itsjava.interfacesHW2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Plant implements Eatable{
    private final String name;

    @Override
    public void eat() {
        System.out.println("Питаюсь водой и солнечным светом!");
    }

}
