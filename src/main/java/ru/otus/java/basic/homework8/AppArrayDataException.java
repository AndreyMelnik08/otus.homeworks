package ru.otus.java.basic.homework8;

public class AppArrayDataException extends RuntimeException {

    public AppArrayDataException(int i, int j) {
        super("Некорректный формат преобразования: " + i + " " + j);
    }

}

