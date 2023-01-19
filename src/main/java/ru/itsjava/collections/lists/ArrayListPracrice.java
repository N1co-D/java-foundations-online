package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPracrice {

    public static void main(String[] args) {
        List<Watch> watchesList = new ArrayList<>();
        Watch seiko = new Watch("Seiko", "Vitaliy", 18000);
        Watch gShock = new Watch("GSHOCK", "Best Dancer", 100000);

        watchesList.add(seiko);
        watchesList.add(gShock);

        for (Watch elemWatch : watchesList) {
            System.out.println(elemWatch);
        }

//        watches.remove(0);
        watchesList.remove(seiko);

        System.out.println();

        for (Watch elemWatch : watchesList) {
            System.out.println(elemWatch);
        }

        System.out.println();

        System.out.println("watches.contains(gShock) = " + watchesList.contains(gShock));
        System.out.println("watches.contains(seiko) = " + watchesList.contains(seiko));

        System.out.println();

        System.out.println("watches = " + watchesList);

        System.out.println("watches.get(0) = " + watchesList.get(0).getModel());

        System.out.println();

        watchesList.set(0, seiko);
        System.out.println("watches = " + watchesList);

        System.out.println();

        System.out.println("watches.size() = " + watchesList.size());

        System.out.println();

        List<Watch> omegaWatchesList = new ArrayList<>();
        Watch andrewOmega = new Watch("Omega", "Andrew", 100_000);
        Watch romanOmega = new Watch("Omega", "Roman", 100_000);

        omegaWatchesList.add(andrewOmega);
        omegaWatchesList.add(romanOmega);

        System.out.println("omegaWatchesList = " + omegaWatchesList);

        System.out.println();

        watchesList.addAll(omegaWatchesList);

        System.out.println("watchesList = " + watchesList);

        Watch vitaliyWatch = new Watch("Seiko","Vitaliy", 20_000);

        watchesList.add(1,vitaliyWatch);

        System.out.println();

        System.out.println("watchesList = " + watchesList);

    }

}
