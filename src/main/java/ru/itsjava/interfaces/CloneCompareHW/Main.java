package ru.itsjava.interfaces.CloneCompareHW;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person ivan = new Person("Иван", "Васильев", 17);
        Person stepan = new Person("Степан", "Грибов", 21);
        System.out.println("Результат = " + ivan.compareTo(stepan));

        System.out.println("---------------------------------------------------------------------------");

        Person alex = new Person("Александр", "Милославский", 32);
        Person vladimir = new Person("Владимир", "Милославский", 15);
        System.out.println("Результат = " + alex.compareTo(vladimir));

        System.out.println("---------------------------------------------------------------------------");

        Person petr1 = new Person("Петр", "Воробьев", 32);
        Person petr2 = new Person("Петр", "Воробьев", 25);
        System.out.println("Результат = " + petr1.compareTo(petr2));

        System.out.println("---------------------------------------------------------------------------");

        System.out.print("Массив до сортировки: ");
        Person[] people = {ivan, stepan, alex, vladimir, petr1, petr2};
        System.out.println(Arrays.toString(people));
        Arrays.sort(people);
        System.out.print("Массив после сортировки: ");
        System.out.println(Arrays.toString(people));

        System.out.println("---------------------------------------------------------------------------");

        Person ivan2 = (Person) ivan.clone();
        System.out.println("ivan = " + ivan);
        System.out.println("ivan2 = " + ivan2);
    }

}
