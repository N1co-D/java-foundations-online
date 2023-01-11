package ru.itsjava.interfaces;

public class interfacesPractice {

    public static void main(String[] args) {
        Creatable khotabich = new Gin();
        khotabich.createWish();

        Creatable badGin = new BadGin();
        badGin.createWish();

    }

}
