package ru.itsjava.object;

public class ObjectPractice {
    public static void main(String[] args) {

        Dog bobik = new Dog("Бобик", 4);
        Dog bobik2 = new Dog("Бобик", 4);
        Dog timosha = new Dog("Тимоша", 2);

        System.out.println("bobik.equals(bobik2) = " + bobik.equals(bobik2));
        System.out.println("bobik.equals(timosha) = " + bobik.equals(timosha));

        System.out.println("bobik.hashCode() = " + bobik.hashCode());
        System.out.println("bobik2.hashCode() = " + bobik2.hashCode());
        System.out.println("timosha.hashCode() = " + timosha.hashCode());

        System.out.println("bobik.toString() = " + bobik.toString());

        System.out.println("-----------------------------------------------------------------------------------");

        Phone iPhoneXSilver = new Phone("iPhone X", 256, false, true);
        Phone iPhoneXBlack = new Phone("iPhone X", 256, false, true);
        Phone iPhone13ProMaxSilver = new Phone("iPhone 13 Pro Max", 512, true, true);
        Phone iPhone13ProMaxGold = new Phone("iPhone 13 Pro Max", 512, true, true);

        System.out.println("iPhoneXBlack.equals(iPhoneXGray) = " + iPhoneXBlack.equals(iPhoneXSilver));
        System.out.println("iPhoneXSilver.equals(iPhone13ProMaxSilver) = " + iPhoneXSilver.equals(iPhone13ProMaxSilver));
        System.out.println("iPhone13ProMaxSilver.equals(iPhone13ProMaxGold) = " + iPhone13ProMaxSilver.equals(iPhone13ProMaxGold));

        System.out.println("iPhoneXSilver.hashCode() = " + iPhoneXSilver.hashCode());
        System.out.println("iPhoneXBlack.hashCode() = " + iPhoneXBlack.hashCode());
        System.out.println("iPhone13ProMaxSilver.hashCode() = " + iPhone13ProMaxSilver.hashCode());
        System.out.println("iPhone13ProMaxGold.hashCode() = " + iPhone13ProMaxGold.hashCode());

        System.out.println(iPhone13ProMaxSilver);
        iPhone13ProMaxSilver.setStorage(256);
        System.out.println("iPhone13ProMaxSilver.getStorage() = " + iPhone13ProMaxSilver.getStorage());
    }

}
