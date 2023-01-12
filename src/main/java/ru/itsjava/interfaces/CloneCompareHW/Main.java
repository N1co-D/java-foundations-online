package ru.itsjava.interfaces.CloneCompareHW;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person ivan = new Person("Иван", "Васильев", 17);
        Person vasya = new Person("Степан", "Королев", 21);
        System.out.println("Результат = " + ivan.compareTo(vasya));

        System.out.println("---------------------------------------------------------------------------");

        Person alex = new Person("Александр", "Милославский", 32);
        Person vladimir = new Person("Владимир", "Грибов", 15);
        System.out.println("Результат = " + alex.compareTo(vladimir));

        System.out.println("---------------------------------------------------------------------------");

        System.out.print("Массив до сортировки: ");
        Person[] people = {ivan, vasya, alex, vladimir};
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
