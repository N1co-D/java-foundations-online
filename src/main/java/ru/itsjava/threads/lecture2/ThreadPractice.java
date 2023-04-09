package ru.itsjava.threads.lecture2;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        anonymousRunnable.run();

        Thread thread = new Thread(anonymousRunnable);
        thread.start();


        Runnable functionalRunnable = () -> System.out.println("Hello from functional programming!");
        new Thread(functionalRunnable).start();

//        new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("Hello from quick thread");
//            }
//        }).start();


        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello from the dream");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.setDaemon(true);
        thread1.start();

        Thread.sleep(3000);
        System.out.println("End main thread");
    }
}