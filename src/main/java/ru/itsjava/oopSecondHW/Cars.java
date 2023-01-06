package ru.itsjava.oopSecondHW;

public class Cars {
    private final String model;
    private int yearOfRelease;
    private final String bodyWork;
    private int price;

    public Cars(String model, int yearOfRelease, String bodyWork, int price) {
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.bodyWork = bodyWork;
        this.price = price;
    }

    public String toString() {
        return "Модель автомобиля: " + model + ", год выпуска - " + yearOfRelease + ", тип кузова - " + bodyWork + ", цена - " + price + " рублей";
    }

}
