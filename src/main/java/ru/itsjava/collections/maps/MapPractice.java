package ru.itsjava.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<Man, String> men = new HashMap<>();

        Man ivanov = new Man("Ivanov");
        Man sidorov = new Man("Sidorov");
        Man javov = new Man("Javov");

        men.put(ivanov, "T-Shirt");
        men.put(sidorov, "Shirt");
        men.put(javov, "Sweater");

        System.out.println("men = " + men);
        System.out.println();

        for (Map.Entry<Man, String> pair : men.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

        System.out.println();

        for (Man keyMan : men.keySet()) {
            System.out.println(keyMan + ": " + men.get(keyMan));
        }

        System.out.println();
        System.out.println("men.remove(ivanov) = " + men.remove(ivanov));

        System.out.println();
        System.out.println("After deleting Ivanov");
        for (Man keyMan : men.keySet()) {
            System.out.println(keyMan + ": " + men.get(keyMan));
        }

        System.out.println();
        System.out.println("men.size() = " + men.size());
        System.out.println("men.isEmpty() = " + men.isEmpty());

        System.out.println();
        men.replace(javov, "Sweater", "Gloves");
        System.out.println("men.get(javov) = " + men.get(javov));
        System.out.println("men = " + men);

        System.out.println();
        men.clear();
        System.out.println("After clearing...");
        System.out.println("men.size() = " + men.size());
    }

}
