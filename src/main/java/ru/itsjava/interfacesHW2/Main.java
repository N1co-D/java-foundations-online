package ru.itsjava.interfacesHW2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Person---------------------");

        Man boy = new Man("Alex");
        boy.eat();
        boy.talk();

        System.out.println();
        System.out.println("Cow---------------------");

        Cow murka = new Cow("Murka");
        murka.eat();
        murka.talk();

        System.out.println();
        System.out.println("Plant---------------------");

        Plant rose = new Plant("Rose");
        rose.eat();
    }

}
