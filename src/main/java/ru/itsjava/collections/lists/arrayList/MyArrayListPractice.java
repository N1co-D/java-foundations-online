package ru.itsjava.collections.lists.arrayList;

public class MyArrayListPractice {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();

        System.out.println("list.size() = " + list.size());
        list.add("Hello");
        list.add("Bye");
        System.out.println("list.size() = " + list.size());

        list.add("Bye");
        list.add("Bye");
        list.add("Bye");
        list.add("Bye");
        list.add("Bye");
        list.add("Bye");
        list.add("Bye");
        list.add("Bye");
        list.add("Bye");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.toString() = " + list);

        MyArrayList list2 = new MyArrayList();

        System.out.println("list2.isEmpty() = " + list2.isEmpty());
        list2.add("Hello");
        System.out.println("list2.isEmpty() = " + list2.isEmpty());

        System.out.println("list.contains(\"Daniil\") = " + list.contains("Daniil"));
        System.out.println("list.contains(\"Hello\") = " + list.contains("Hello"));

        list.clear();
        System.out.println("list = " + list);
    }

}
