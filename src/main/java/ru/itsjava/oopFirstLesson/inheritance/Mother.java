package ru.itsjava.oopFirstLesson.inheritance;

public interface Mother {

    default void giveLove() {
        System.out.println("Mother loves you!");
    }
}
