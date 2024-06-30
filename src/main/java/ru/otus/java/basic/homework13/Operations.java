package ru.otus.java.basic.homework13;

public class Operations {

    public static double operations(String userInput) {
        String[] values = userInput.split(" ");
        if (values.length != 3) {
            System.out.println("Некорректный формат ввода");
            return 0;
        }
        double num1 = Double.parseDouble(values[0]);
        double num2 = Double.parseDouble(values[2]);
        String operator = values[1];
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Деление на ноль невозможно");
                    return num1;
                }
                break;
            default:
                System.out.println("Некорректный оператор");
                return num1;
        }
        System.out.println(result);
        return result;
    }
}
