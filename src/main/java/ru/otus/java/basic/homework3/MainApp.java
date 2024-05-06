package ru.otus.java.basic.homework3;

public class MainApp {


    public static void main(String[] args) {

        int [][] array = {{4, 8, 8, 10, 15}, {-2, 5, 6, -7, 10}};
        char [][] arraySquare = new char[10][10];

        // Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный
        // двумерный массив, метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
        System.out.println(sumOfPositiveElements(array));
        System.out.println();

        //Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат
        // из символов * со сторонами соответствующей длины;
        printSquare(arraySquare);
        System.out.println();

        //Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив, и зануляющий
        // его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);
        arrayDiagonalSquare(arraySquare);
        System.out.println();

        //Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
        System.out.println(findMax(array));
        System.out.println();

        //Реализуйте метод, который считает сумму элементов второй строки двумерного массива, если второй строки
        // не существует, то в качестве результата необходимо вернуть -1
        System.out.println(sumOfSecondString(array));

    }

    public static int sumOfPositiveElements(int [][] in) {
        int sum = 0;
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                if (in[i][j] > 0) {
                    sum += in[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquare(char[][] arraySquare) {
        for (int i = 0; i < arraySquare.length; i++) {
            for (int j = 0; j < arraySquare[i].length; j++) {
                arraySquare[i][j] = '*';
                System.out.print(arraySquare[i][j]);
            }
            System.out.println();
        }
    }

    public static void arrayDiagonalSquare(char[][] arraySquare) {
        for (int i = 0; i < arraySquare.length; i++) {
            for (int j = 0; j < arraySquare[i].length; j++) {
                arraySquare[i][j] = '*';
                if (i - j  == 0) {
                    arraySquare[i][j] = '0';
                }
                System.out.print(arraySquare[i][j]);
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int sumOfSecondString(int[][] array) {
        int sum = 0;
        if (array.length < 2) {
            sum = -1;
        } else {
            for (int i = 1; i < 2; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
