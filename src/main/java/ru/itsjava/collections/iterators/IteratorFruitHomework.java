package ru.itsjava.collections.iterators;

import java.util.HashMap;
import java.util.Map;

public class IteratorFruitHomework {
    public static void main(String[] args) {
        Map<Fruit, String> fruits = new HashMap<>();

        Fruit redApples = new Fruit("Яблоко", 10);
        Fruit yellowApples = new Fruit("Яблоко", 15);
        Fruit greenApples = new Fruit("Яблоко", 13);
        Fruit orange = new Fruit("Апельсин", 3);
        Fruit banana = new Fruit("Банан", 5);
        Fruit lemon = new Fruit("Лимон", 6);
        Fruit russianMelons = new Fruit("Дыня", 6);
        Fruit armenianMelons = new Fruit("Дыня", 13);
        Fruit russianWatermelons = new Fruit("АРБУЗ", 11);
        Fruit turkishWatermelons = new Fruit("Арбуз", 15);
        Fruit armenianWatermelons = new Fruit("Арбуз", 13);
        Fruit africanWatermelons = new Fruit("Арбуз", 14);

        fruits.put(redApples, "Ivanov");
        fruits.put(yellowApples, "Sidorov");
        fruits.put(greenApples, "Zubin");
        fruits.put(orange, "Larchenkov");
        fruits.put(banana, "Javov");
        fruits.put(lemon, "Petrov");
        fruits.put(russianMelons, "Semenov");
        fruits.put(armenianMelons, "Kruglov");
        fruits.put(turkishWatermelons, "Smolin");
        fruits.put(armenianWatermelons, "Sotin");
        fruits.put(russianWatermelons, "Jakov");
        fruits.put(africanWatermelons, "Izotov");

        //HashSet, HashMap, ArrayList, LinkedHashSet, LinkedList - коллекции (классы). Set, Map, List - интерфейсы. Иерархия!
        //Map.Entry - связка из ключа и значения объекта Map
        //entrySet - метод по возврату Set из связки <Map.Entry>
        for (Map.Entry<Fruit, String> pair : fruits.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        for (Fruit keyFruit : fruits.keySet()) {
            if (fruits.get(keyFruit).length() > 5) {
                System.out.println(fruits.get(keyFruit));
            }
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        int countOfMelons = 0;
        for (Fruit keyFruit : fruits.keySet()) {
            if (keyFruit.getName().equals("Дыня") ) {
                countOfMelons++;
            }
        }
        System.out.println("Общее количество позиций по дыням = " + countOfMelons);

        System.out.println("-----------------------------------------------------------------------------------------");
        int countOfWatermelons = 0;
        for (Fruit keyFruit : fruits.keySet()) {
            if ((keyFruit.getName().equalsIgnoreCase("Арбуз")) && (countOfWatermelons != 2)) {
                countOfWatermelons++;
            } else {
                System.out.println(keyFruit.getName());
            }
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        int countOfLetterA = 0;
        for (Fruit keyFruit : fruits.keySet()) {
//            if ((keyFruit.getName().charAt(0) == "А" && (countOfLetterA != 2)) {
            if ((keyFruit.getName().startsWith("А")) && (countOfLetterA != 2)) {
                countOfLetterA++;
            } else {
                System.out.println(keyFruit.getName());
            }
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        for (Fruit keyFruit : fruits.keySet()) {
            if (keyFruit.getName().equalsIgnoreCase("Арбуз")) {
                System.out.println(keyFruit.getName());
                break;
            }
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Map<Fruit, String> allMelonsAndWatermelons = new HashMap<>();
        for (Fruit keyFruit : fruits.keySet()) {
            if ((keyFruit.getName().equalsIgnoreCase("Арбуз")) || (keyFruit.getName().equalsIgnoreCase("Дыня"))) {
                allMelonsAndWatermelons.put(keyFruit, fruits.get(keyFruit));
            }
        }
        for (Map.Entry<Fruit, String> pair : allMelonsAndWatermelons.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        double totalWeight = 0;
        int countOfFruits = 0;
        for (Fruit keyFruit : fruits.keySet()) {
            totalWeight += keyFruit.getWeight();
            countOfFruits++;
        }
        double averageWeight = totalWeight/countOfFruits;
        System.out.println("Средний вес всех фруктов = " + averageWeight);

    }
}
