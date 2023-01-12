package ru.itsjava.interfaces.comparable;

import java.util.Arrays;

public class ComparablePractice {
    public static void main(String[] args) {
        Boy daniil = new Boy("Daniil", 17, 183);
        Boy timofey = new Boy("Timofey", 15, 173);
        Boy vladimir = new Boy("Vladimir", 18, 185);

        System.out.println("daniil.compareTo(timofey) = " + daniil.compareTo(timofey));
        System.out.println("timofey.compareTo(vladimir) = " + timofey.compareTo(vladimir));

        Boy[] boys = {daniil, timofey, vladimir};
        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));
        Arrays.sort(boys);
        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));

    }

}
