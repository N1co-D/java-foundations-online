package ru.itsjava.threads.lecture3;

import lombok.SneakyThrows;

public class ThreadPractise {
    public static void main(String[] args) throws InterruptedException {
//        Object obj = new Object();
//
//        synchronized (obj) {
//            obj.notify();
//        }

//        ThreadPractise threadPractise = new ThreadPractise();
//        MyThread thread1 = new MyThread(1, threadPractise);
//        MyThread thread2 = new MyThread(2, threadPractise);
//        MyThread thread3 = new MyThread(3, threadPractise);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();

//        Thread.currentThread().join();
    }

    @SneakyThrows
    public synchronized void printNum(int num) {
//        synchronized (this) {
            System.out.println("Begin " + num);
            this.wait(3000);
            System.out.println("End " + num);
//        }
    }

}
