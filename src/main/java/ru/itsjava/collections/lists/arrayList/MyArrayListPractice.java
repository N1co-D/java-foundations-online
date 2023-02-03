package ru.itsjava.collections.lists.arrayList;

public class MyArrayListPractice {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();

        System.out.println("list.size() = " + list.size());
        list.add("Hello");
        list.add("Bye1");
        System.out.println("list.size() = " + list.size());

        list.add("Bye2");
        list.add("Bye3");
        list.add("Bye4");
        list.add("Bye5");
        list.add("Bye6");
        list.add("Bye7");
        list.add("Bye8");
        list.add("Bye8");
        list.add("Bye8");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.toString() = " + list);

//        MyArrayList list2 = new MyArrayList();
//
//        System.out.println("list2.isEmpty() = " + list2.isEmpty());
//        list2.add("Hello");
//        System.out.println("list2.isEmpty() = " + list2.isEmpty());
//
//        System.out.println("list.contains(\"Daniil\") = " + list.contains("Daniil"));
//        System.out.println("list.contains(\"Hello\") = " + list.contains("Hello"));

//        list.clear();
//        System.out.println("list = " + list);

//        System.out.println("list.remove(\"Bye2\") = " + list.remove("Bye2"));
//        System.out.println("list.size() = " + list.size());
//        System.out.println("list = " + list);

        System.out.println("list.remove(2) = " + list.remove(2));
        System.out.println("list = " + list);
        System.out.println("list.remove(\"Bye7\") = " + list.remove("Bye7"));
        System.out.println("list = " + list);

        System.out.println("list.indexOf(\"Hello\") = " + list.indexOf("Hello"));
        System.out.println("list.indexOf(\"Bye4\") = " + list.indexOf("Bye4"));

        System.out.println("list.lastIndexOf(\"Bye8\") = " + list.lastIndexOf("Bye8"));

        System.out.println("list.get(4) = " + list.get(4));
        System.out.println("list.get(0) = " + list.get(0));

        System.out.println("list.set(7,\"Hello_again\") = " + list.set(7, "Hello_again"));
        System.out.println("list = " + list);

        System.out.println("list.size() = " + list.size());
        list.add(4, "Goodbye");
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
    }

}
