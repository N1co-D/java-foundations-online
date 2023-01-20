package ru.itsjava.exception.exceptionHomework;

public class Main {

    public static void main(String[] args) {

//        Person vladimir = new Person("Vladimir", 30);
//        System.out.println("vladimir.getAge() = " + vladimir.getAge());

//        Person maria = new Person("Maria", 200);
//        System.out.println("maria.getAge() = " + maria.getAge());

        Test a = new Test(3, 0);
        try { //код где может быть эксепшион оборачиваем в трай
            System.out.println("a.delenie() = " + a.delenie(3, 0));
        } catch (ArithmeticException|AgeNotValidException arithmeticException) { // обработка исключения, слева - ниже по иерархии
            System.out.println("error catched");
        } finally {
            System.out.println("Finally"); // работает в любом случае независимо от возникновения ошибки
        }

        System.out.println("hhh");

        //непроверяемые(error) - те, которые не могут быть обработаны (поймать можно)
        //проверяемые - те, которые должны быть обработаны (поймать можно)

    }

}
