package ru.otus.java.basic.oophomework4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User[] users = {

                new User("Андреев", "Андрей", "Андреевич", 1988, "andreev@mail.ru"),
                new User("Иванов", "Иван", "Иванович", 1999, "ivanov@mail.ru"),
                new User("Сидоровa", "Анна", "Витальевна", 2000, "sidorova@mail.ru"),
                new User("Смирнов", "Олег", "Олегович", 1978, "smirnov@mail.ru"),
                new User("Попов", "Кирилл", "Кириллович", 1960, "popov@mail.ru"),
                new User("Морозова", "Анастасия", "Сергеевна", 2003, "morozova@mail.ru"),
                new User("Кузнецов", "Денис", "Олегович", 1993, "kuznetcov@mail.ru"),
                new User("Зайцев", "Никита", "Константинович", 1982, "paytsev@mail.ru"),
                new User("Степанов", "Виталий", "Федорович", 1972, "stepanov@mail.ru"),
                new User("Орлова", "Ксения", "Михайловна", 1999, "orlova@mail.ru"),
        };

        infoOlderFortyYears(users);
        //В методе main() Main класса создайте массив из 10 пользователей и заполните его объектами и с помощью
        // цикла выведите информацию только о пользователях старше 40 лет.

        Box[] boxes = {
                new Box("30х30х30", "серый", true, "пустая"),
                new Box("20х20х20", "черный", true, "пустая"),
                new Box("10х10х10", "желтый", true, "пустая")
        };

        //Консоль для взаимодействия с коробками
        printMenu();

        int idMenu = scanner.nextInt();
        do {
            if (idMenu == 1) {
                infoBox(boxes);
                printMenu();
                idMenu = scanner.nextInt();
            } if (idMenu == 2) {
                System.out.println("Какую коробку Вы хотите открыть? 1 - Большая (30х30х30), 2 - Средняя (20х20х20), "
                        + "3 - Маленькая (10х10х10)");
                int idBox = scanner.nextInt();
                boxes[idBox - 1].open();
                printMenu();
                idMenu = scanner.nextInt();
            } if (idMenu == 3) {
                System.out.println("Какую коробку Вы хотите закрыть? 1 - Большая (30х30х30), 2 - Средняя (20х20х20), "
                        + "3 - Маленькая (10х10х10)");
                int idBox = scanner.nextInt();
                boxes[idBox - 1].close();
                printMenu();
                idMenu = scanner.nextInt();
            } if (idMenu == 4) {
                System.out.println("Какую коробку Вы хотите перекрасить? 1 - Большая (30х30х30), 2 - " +
                        "Средняя (20х20х20)," + " 3 - Маленькая (10х10х10)");
                int idBox = scanner.nextInt();
                System.out.println("В какой цвет Вы хотите покрасить?");
                String color = scanner.next();
                boxes[idBox - 1].setColor(color);
                boxes[idBox - 1].changeColor();
                printMenu();
                idMenu = scanner.nextInt();
            } if (idMenu == 5) {
                System.out.println("В какую коробку Вы хотите положить? 1 - Большая (30х30х30), 2 - " +
                        "Средняя (20х20х20), 3 - Маленькая (10х10х10)");
                int idBox = scanner.nextInt();
                System.out.println("Что Вы хотите положить?");
                String thing = scanner.next();
                if (boxes[idBox - 1].getFilling().equals("пустая")) {
                    boxes[idBox - 1].put(thing);
                } else {
                    System.out.println("В коробке уже лежит предмет " + boxes[idBox - 1].getFilling());
                }
                printMenu();
                idMenu = scanner.nextInt();
            } if (idMenu == 6) {
                System.out.println("Из какой коробки Вы хотите достать предмет? 1 - Большая (30х30х30), " +
                        "2 - Средняя (20х20х20), 3 - Маленькая (10х10х10)");
                int idBox = scanner.nextInt();
                if (!boxes[idBox - 1].isOpened()) {
                    System.out.println("Коробка закрыта, сначала откройте ее");
                }
                if (!boxes[idBox - 1].getFilling().equals("пустая")) {
                    System.out.println("Вы достали " + boxes[idBox - 1].getFilling());
                    boxes[idBox - 1].get();
                } else {
                    System.out.println("В коробке ничего нет");
                }
                printMenu();
                idMenu = scanner.nextInt();
            }
        } while (idMenu !=7);

    }

    public static void infoOlderFortyYears(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBirthDate() < 1984) {
                users[i].info();
                System.out.println();
            }
        }
    }

    public static void printMenu () {
        System.out.println("Какое действие Вы хотите совершить?");
        System.out.println("1. Вывести информацию о коробках");
        System.out.println("2. Открыть коробку");
        System.out.println("3. Закрыть коробку");
        System.out.println("4. Изменить цвет коробки");
        System.out.println("5. Положить в коробку предмет");
        System.out.println("6. Достать предмет из коробки");
        System.out.println("7. Выйти");
    }

    public static void infoBox(Box[] boxes) {
        for (int i = 0; i < boxes.length; i++) {
            boxes[i].info();
        }
    }
}
