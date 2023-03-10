package ru.itsjava.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapFruitHomework {
    public static void main(String[] args) {

        Map<Fruit, String> fruits = new HashMap<>();

        Fruit apple = new Fruit("Apple", 10);
        Fruit orange = new Fruit("Orange", 3);
        Fruit banana = new Fruit("Banana", 5);
        Fruit lemon = new Fruit("Lemon", 6);
        Fruit watermelon = new Fruit("Watermelon", 20);

        fruits.put(apple, "Ivanov");
        fruits.put(orange, "Sidorov");
        fruits.put(banana, "Javov");
        fruits.put(lemon, "Petrov");
        fruits.put(watermelon, "Semenov");

        Map<Fruit, String> allFruits = new HashMap<>();
        allFruits.putAll(fruits);

        allFruits.remove(watermelon);

        System.out.println("fruits.containsKey(orange) = " + allFruits.containsKey(orange));
        System.out.println("fruits.containsKey(watermelon) = " + allFruits.containsKey(watermelon));

        System.out.println();
        for (Fruit keyFruit : allFruits.keySet()) {
            System.out.println(allFruits.get(keyFruit));
        }

        System.out.println();
        for (Fruit keyFruit : allFruits.keySet()) {
            System.out.println(keyFruit.getName());
        }

        System.out.println();
        for (Map.Entry<Fruit, String> pair : allFruits.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }
}
