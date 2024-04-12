package ru.otus.java.basic.homework1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение от 1 до 5");
        int idOfMethod = scanner.nextInt();
        if (idOfMethod == 1) {
            greetings();
        }
        if (idOfMethod == 2) {
            checkSign(2,3,5);
        }
        if (idOfMethod == 3) {
            selectColor();
        }
        if (idOfMethod == 4) {
            compareNumbers();
        }
        if (idOfMethod == 5) {
            addOrSubtractAndPrint(10, 20, true);
        }
    }

    public static void greetings() {
        System.out.println("Hello \nWorld \nfrom \nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        Scanner scannerSelectColor = new Scanner(System.in);
        System.out.println("Введите значение");
        int data = scannerSelectColor.nextInt();
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data > 10 && data <= 20) {
            System.out.println("Красный");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 1000);
        int b = (int) (Math.random() * 1000);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int incrementResult;
        if (increment == true) {
            incrementResult = initValue + delta;
            System.out.println("increment = true. Произведено сложение: " + incrementResult);
        } else {
            incrementResult = initValue - delta;
            System.out.println("increment = false. Произведено вычетание: " + incrementResult);
        }
    }
}
