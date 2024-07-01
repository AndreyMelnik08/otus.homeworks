package ru.otus.java.basic.homework14;

public class MainWork {

    public long timeMainWork() {

        long startTime = System.currentTimeMillis();

        double[] array = new double[100_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        return System.currentTimeMillis() - startTime;
    }
}
