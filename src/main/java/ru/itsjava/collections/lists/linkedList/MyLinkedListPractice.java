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
        System.out.println("listEmpty.size() = " + listEmpty.size());
        System.out.println("listEmpty.isEmpty() = " + listEmpty.isEmpty());

        System.out.println();

        System.out.println("list.contains(\"Hello 1\") = " + list.contains("Hello 1"));
        System.out.println("list.contains(\"Bye\") = " + list.contains("Bye"));

        System.out.println();

        System.out.println("list.remove(3) = " + list.remove(3));
        System.out.println("list = " + list);

        System.out.println();

//        list.clear();
//        System.out.println("list = " + list);
//        listEmpty.clear();

        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.get(2) = " + list.get(2));
        System.out.println("list.get(3) = " + list.get(3));
//        System.out.println("list.get(4) = " + list.get(4));

        System.out.println();

        System.out.println("list.set(0, \"Bye\") = " + list.set(0, "Bye"));
        System.out.println("list.set(3, \"Bye\") = " + list.set(3, "Bye"));

        System.out.println();

        System.out.println("list = " + list);
    }

}
