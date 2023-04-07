package ru.itsjava.enums;

public class EnumPractice {
    public static void main(String[] args) {

        System.out.println("Season.WINTER = " + Season.WINTER);
        System.out.println("Season.valueOf(\"WINTER\") = " + Season.valueOf("WINTER"));
        Season[] seasons = Season.values();

        for (Season season : seasons) {
            System.out.print(season + " ");
        }
        System.out.println();

        Season season = Season.FALL;
        switch (season){
            case FALL:
                System.out.println("It's fall");
                break;
            case SPRING:
                System.out.println("It's spring");
                break;
            default:
                System.out.println("It's something else");
        }

        System.out.println("Coffee.AMERICANO = " + Coffee.AMERICANO);
        System.out.println("Coffee.AMERICANO.getCharacteristic() = " + Coffee.AMERICANO.getCharacteristic());

    }

}
