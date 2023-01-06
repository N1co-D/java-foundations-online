package ru.itsjava.oopFirstHW;

public class OOPPractice {
    public static void main(String[] args) {

        Birds budgie = new Parrots("budgie", "green", 12, false);
        System.out.println("budgie.toString() = " + budgie.toString());

        Birds grayRaven = new Ravens("gray raven", "gray", 10, true);
        System.out.println("grayRaven.toString() = " + grayRaven.toString());

    }

}
