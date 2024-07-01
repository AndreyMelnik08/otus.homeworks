package ru.otus.java.basic.homework14;

public class Threads extends Thread {

    public long timeThreads() {

        long startTime = System.currentTimeMillis();
        double[] array = new double[100_000_000];

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < array[24_999_999]; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 25_000_000; i < array[49_999_999]; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 50_000_000; i < array[74_999_999]; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 75_000_000; i < array.length; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        return System.currentTimeMillis() - startTime;

    }
}