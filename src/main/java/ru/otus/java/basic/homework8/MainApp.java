package ru.otus.java.basic.homework8;

public class MainApp {
    public static void main(String[] args) {

        String [][] arraySquare = new String[4][4];
        fillingSquare(arraySquare);
        sumElements(arraySquare);

        try {
            sumElementsWithException(arraySquare);
        } catch (AppArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

        for (int i = 0; i < arraySquare.length; i++) {
            for (int j = 0; j < arraySquare[i].length; j++) {
                System.out.print(arraySquare[i][j]);
            }
            System.out.println();
        }

        try { sizeException (arraySquare);
        } catch (AppArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fillingSquare(String[][] arraySquare) {
        for (int i = 0; i < arraySquare.length; i++) {
            for (int j = 0; j < arraySquare[i].length; j++) {
                arraySquare[i][j] = "5";
                System.out.print(arraySquare[i][j]);
            }
            System.out.println();
        }
    }


    public static void sumElements(String[][] arraySquare)  {
        int sum = 0;
        for (int i = 0; i < arraySquare.length; i++) {
            for (int j = 0; j < arraySquare[i].length; j++) {
                int elementOfArray = Integer.parseInt((arraySquare[i][j]));
                sum += elementOfArray;

            }
        }
        System.out.println(sum);
    }

    public static void sumElementsWithException(String[][] arraySquare) throws AppArrayDataException {
            int sum = 0;
            arraySquare[0][2] = "Q";
            for (int i = 0; i < arraySquare.length; i++) {
                for (int j = 0; j < arraySquare[i].length; j++) {
                    try {
                        int elementOfArray = Integer.parseInt((arraySquare[i][j]));
                        sum += elementOfArray;
                    } catch (NumberFormatException e) {
                        throw new AppArrayDataException(i, j);
                    }
                }
            }
            System.out.println(sum);
        }

    public static void sizeException (String[][] array) throws AppArraySizeException {
        if (array.length != 4 || array[0].length != 4) {
            throw new AppArraySizeException(); }
    }
}



//Реализуйте метод, аргументом которого является двумерный строковый массив размером 4х4.
// Если передан массив другого размера необходимо бросить исключение AppArraySizeException.
//Метод должен обойти все элементы массива, преобразовать в int и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит текст вместо числа),
// должно быть брошено исключение AppArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//В методе main() необходимо вызвать полученный метод, обработать возможные исключения AppArraySizeException
// и AppArrayDataException и вывести результат расчета (сумму элементов,
// при условии что подали на вход корректный массив).
