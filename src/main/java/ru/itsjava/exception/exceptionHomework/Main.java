package ru.itsjava.exception.exceptionHomework;

public class Main {

    public static void main(String[] args) {

        Person vladimir = new Person("Vladimir", 30);
        System.out.println("vladimir.getAge() = " + vladimir.getAge());

        Person maria = new Person("Maria", 200);
        System.out.println("maria.getAge() = " + maria.getAge());

    }

}
