package ru.itsjava.threads;

public class ThreadPracticeHW {
    public static void main(String[] args) throws InterruptedException {
        ThreadPrinter threadPrinterFirst = new ThreadPrinter("Java", 1000L);

        PrinterRunnable printerRunnable = new PrinterRunnable("Python", 2000L);
        Thread threadSecond = new Thread(printerRunnable);

        System.out.println("Задание №1. Начало!");

        threadPrinterFirst.start();
        threadSecond.start();

        threadSecond.join();
        System.out.println();
        System.out.println("Задание №1. Конец!");

        System.out.println();

        PrinterRunnable printerMassageRunnable = new PrinterRunnable("Practice Java!", 5000L);
        Thread threadMassage = new Thread(printerMassageRunnable);

        System.out.println("Задание №2. Начало!");
        threadMassage.start();
        threadMassage.join();
        System.out.println();
        System.out.println("Задание №2. Конец!");

    }

}
