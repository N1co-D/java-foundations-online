package ru.itsjava.threads.lecture2;

public class ThreadHW {
    public static void main(String[] args) {

        Runnable functionalRunnable = () -> System.out.println("Привет я Runnable!");
        new Thread(functionalRunnable).start();

        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Привет я проснулся после 4 секунд!");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.setDaemon(true);
        thread1.start();

        System.out.println("End main thread");
    }
}
