package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        Watch vitaliySeiko = new Watch("Seiko", "Vitaliy", 18_000);
        Watch viktorSeiko = new Watch("Seiko", "Viktor", 18_000);
        Watch dmitriySeiko = new Watch("Seiko", "Dmitriy", 30_000);
        Watch valentinOmega = new Watch("Omega", "Valentin", 100_000);

        List<Watch> watches = new ArrayList<>(Arrays.asList(vitaliySeiko, viktorSeiko, dmitriySeiko, valentinOmega));

        System.out.println("Наши часы: " + watches);

        System.out.println("Вывести все часы с фирмой Seiko");
        for (Watch elementWatch : watches) {
            if (elementWatch.getModel().equals("Seiko")) {
                System.out.print(elementWatch + " ");
            }
        }

        System.out.println("Вывести все часы дороже 25.000 рублей");
        for (Watch elementWatch : watches) {
            if (elementWatch.getPrice() > 25000) {
                System.out.print(elementWatch + " ");
            }
        }

        System.out.println("Вывести только одни часы дороже 25.000 рублей");
        for (Watch elementWatch : watches) {
            if (elementWatch.getPrice() > 25000) {
                System.out.print(elementWatch + " ");
                break;
            }
        }

        System.out.println();

        // пропустить первые два элемента фирмы Seiko
        int count = 0;
        for (int i = 0; i < watches.size(); i++) {
            if (watches.get(i).getModel().equals("Seiko") && count < 2){
                count++;
            } else {
                System.out.print(watches.get(i) + " ");
            }
        }


    }

}
