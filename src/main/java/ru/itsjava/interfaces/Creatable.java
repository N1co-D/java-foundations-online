package ru.itsjava.interfaces;

public interface Creatable {
    void createWish();

    default void canYouCreateWish() {
        System.out.println("Я могу исполнить твоё желание!");
    }

}
