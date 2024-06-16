package ru.otus.java.basic.homework12;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Recording recording = new Recording();
        Scanner scanner = new Scanner(System.in);

        recording.info();
        System.out.println("С каким файлом хотите работать? Выбрать от 1 до 3");
        int arrayId = scanner.nextInt();
        System.out.println("В файле " + recording.array[arrayId - 1] + " содержится:");
        recording.read(arrayId);
        System.out.println();
        System.out.println("Что хотите записать?");
        String data = scanner.next();
        recording.recordingInFile(data, arrayId);

    }
}
