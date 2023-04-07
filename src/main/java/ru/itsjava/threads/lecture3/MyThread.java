package ru.itsjava.threads.lecture3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyThread extends Thread {
    private final int num;
    private final ThreadPractise threadPractise;

    @Override
    public void run() {
        threadPractise.printNum(num);
    }
}
