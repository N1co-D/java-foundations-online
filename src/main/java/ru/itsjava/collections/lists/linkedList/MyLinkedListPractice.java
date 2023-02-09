package ru.itsjava.collections.lists.linkedList;

public class MyLinkedListPractice {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.add("Hello 1");
        list.add("Hello 2");
        list.add("Hello 3");
        list.add("Hello 4");
        list.add("Hello 5");
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());

        System.out.println();

        MyLinkedList listEmpty = new MyLinkedList();
        System.out.println("listEmpty.isEmpty() = " + listEmpty.isEmpty());

        System.out.println();

        System.out.println("list.contains(\"Hello 1\") = " + list.contains("Hello 1"));
        System.out.println("list.contains(\"Bye\") = " + list.contains("Bye"));
    }

}
