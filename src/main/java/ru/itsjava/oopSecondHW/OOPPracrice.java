package ru.itsjava.oopSecondHW;

public class OOPPracrice {
    public static void main(String[] args) {
        Cars fordFiesta = new AmericanCar("Ford Fiesta", 2017, "sedan", 858000);
        Cars mercedesBenz = new GermanyCar("Mercedes Benz", 2022, "hatchback", 4150000);
        Cars ladaGranta = new RussianCar("Lada Granta", 2021, "sedan", 678300);

        System.out.println("fordFiesta.toString() = " + fordFiesta.toString());
        System.out.println("mercedesBenz.toString() = " + mercedesBenz.toString());
        System.out.println("ladaGranta.toString() = " + ladaGranta.toString());

    }
}