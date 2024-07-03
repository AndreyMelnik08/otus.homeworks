package ru.otus.java.basic.oophomework7;

public interface Transport {
    default boolean travel(int location, int distance) {
        System.out.println("Вы прошли пешком " + distance + "м");
        return true;
    }
}
