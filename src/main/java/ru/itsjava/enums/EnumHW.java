package ru.itsjava.enums;

public class EnumHW {
    public static void main(String[] args) {

        System.out.println("Week.MONDAY.toString() = " + Week.MONDAY);
        System.out.println("Week.MONDAY.getTranslation() = " + Week.MONDAY.getTranslation());

        System.out.println();
        Week[] week = Week.values();
        for (Week value : week) {
            System.out.println(value + " ");
        }
    }
}
