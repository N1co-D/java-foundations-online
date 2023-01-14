package ru.itsjava.interfacesHW2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Man implements Talkable, Eatable{
    private final String name;

    @Override
    public void talk() {
        System.out.println("Умею говорить на трёх языках!");
    }

    @Override
    public void eat() {
        System.out.println("Сижу на строгой диете!");
    }

}
