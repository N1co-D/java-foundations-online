package ru.itsjava.collections.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetFruitHomework {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 8);
        Fruit banana = new Fruit("Banana", 12);
        Fruit watermelon = new Fruit("Watermelon", 20);

        Set<Fruit> fruitSet = new HashSet<>(Arrays.asList(apple, banana, watermelon));
        System.out.println("fruitSet = " + fruitSet);

        System.out.println("fruitSet.add(apple) = " + fruitSet.add(apple));
        System.out.println("fruitSet = " + fruitSet);

        System.out.println("fruitSet.remove(banana) = " + fruitSet.remove(banana));
        System.out.println("fruitSet = " + fruitSet);

        System.out.println("fruitSet.contains(banana) = " + fruitSet.contains(banana));
        System.out.println("fruitSet.contains(apple) = " + fruitSet.contains(apple));
    }

}
