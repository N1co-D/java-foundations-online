package ru.itsjava.oopFirstHW;

public class Birds {
    private final String species;
    private final String colour;
    private int age;
    private boolean homeBird;

    public Birds(String species, String colour, int age, boolean homeBird) {
        this.species = species;
        this.colour = colour;
        this.age = age;
        this.homeBird = homeBird;
    }

    public String toString() {
        return "Вид птицы: " + species + ", цвет птицы: " + colour + ", возраст - " + age + ", рекомендуется ли в качестве питомца - " + homeBird;
    }

}
