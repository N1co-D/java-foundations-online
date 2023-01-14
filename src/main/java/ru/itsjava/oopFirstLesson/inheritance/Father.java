package ru.itsjava.oopFirstLesson.inheritance;

public interface Father {

    default void giveLove() {
        System.out.println("Father loves you!");
    }

}
