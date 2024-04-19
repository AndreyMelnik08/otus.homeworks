package ru.otus.java.basic.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Реализуйте метод, принимающий в качестве аргументов целое число и строку, 
        и печатающий в консоль строку указанное количество раз*/
        printLine("Hello World", 5);

        /*Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все
        элементы, значение которых больше 5, и печатающий полученную сумму в консоль; */
        sumOfElements(new int[]{4, 4, 5, 7, 9},5);

        /*Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
        метод должен заполниться каждую ячейку массива указанным числом.*/
        fillingArray(5, new int[5]);

        /*Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
        увеличивающий каждый элемент которого на указанное число.*/
        changingArray(2, new int[]{2, 5, 10, 4});

        /*Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий
         в консоль сумма элементов какой из половин массива больше.*/
        sumOfTheElements(new int[]{2, 8, 9, 4, 6, 5, 1, 8, 7, 9, 1, 1});

    }

    public static void printLine(String phrase, int rerequiredNumber) {
        for (int i = 0; i < rerequiredNumber; i++) {
            System.out.println(phrase);
        }
    }

    public static void sumOfElements (int[] array, int value) {
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > value) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillingArray (int value, int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void changingArray (int value, int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += value;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void sumOfTheElements (int [] array) {
        int firstHalfOfElements = 0;
        int secondHalfOfElements = 0;
        for (int i = 0; i < array.length / 2; i++) {
            firstHalfOfElements += array[i];
        }
        for (int i = array.length / 2; i < array.length; i++) {
            secondHalfOfElements += array[i];;
        }
        if (firstHalfOfElements > secondHalfOfElements) {
            System.out.println("Первая часть массива больше. Сумма: " + firstHalfOfElements);
            } else {
            System.out.println("Вторая часть массива больше. Сумма: " + secondHalfOfElements);
        }
    }
}

