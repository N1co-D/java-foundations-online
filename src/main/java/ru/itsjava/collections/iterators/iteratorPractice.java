package ru.itsjava.collections.iterators;

import ru.itsjava.collections.maps.Man;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class iteratorPractice {
    public static void main(String[] args) {
        Map<Man, String> men = new HashMap<>();

        Man ivanov = new Man("Ivanov");
        Man sidorov = new Man("Sidorov");
        Man javov = new Man("Javov");

        men.put(ivanov, "T-Shirt");
        men.put(sidorov, "Shirt");
        men.put(javov, "Sweater");

//        for (Map.Entry<Man, String> pair : men.entrySet()) {
//            System.out.println(pair.getKey() + ": " + pair.getValue());
//        }

        Iterator<Map.Entry<Man, String>> iterator = men.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Man, String> pair = iterator.next();
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }


    }
}
