package ru.otus.java.basic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User[] users = {

            new User("Андреев", "Андрей", "Андреевич", 1989, "andreev@mail.ru"),
            new User("Иванов", "Иван", "Иванович", 1968, "ivanov@mail.ru"),
            new User("Сидоровa", "Анна", "Витальевна", 1995, "sidorova@mail.ru"),
            new User("Смирнов", "Олег", "Олегович", 1980, "smirnov@mail.ru"),
            new User("Попов", "Кирилл", "Кириллович", 2000, "popov@mail.ru"),
            new User("Морозова", "Анастасия", "Сергеевна", 1970, "morozova@mail.ru"),
            new User("Кузнецов", "Денис", "Олегович", 1999, "kuznetcov@mail.ru"),
            new User("Зайцев", "Никита", "Константинович", 1971, "paytsev@mail.ru"),
            new User("Степанов", "Виталий", "Федорович", 1993, "stepanov@mail.ru"),
            new User("Орлова", "Ксения", "Михайловна", 1995, "orlova@mail.ru"),
        };

        infoOlderFortyYears(users);
        //В методе main() Main класса создайте массив из 10 пользователей и заполните его объектами и с помощью
        // цикла выведите информацию только о пользователях старше 40 лет.

        Box[] boxes = {
            new Box("30х30х30", "серый", "открыта", "пустая"),
            new Box("20х20х20", "черный", "открыта", "пустая"),
            new Box("10х10х10", "желтый", "открыта", "пустая")
        };

        //Консоль для взаимодействия с коробками
        printMenu();

        int idMenu = scanner.nextInt();
        do {
            if (idMenu == 1) {
               infoBox(boxes);
               printMenu();
               idMenu = scanner.nextInt();
            } if (idMenu ==2) {
               openBox(boxes);
               printMenu();
               idMenu = scanner.nextInt();
            } if (idMenu == 3) {
                closeBox(boxes);
                printMenu();
                idMenu = scanner.nextInt();
            } if (idMenu == 4) {
                changeColor(boxes);
                printMenu();
                idMenu = scanner.nextInt();
            } if (idMenu == 5) {
                putToBox(boxes);
                printMenu();
                idMenu = scanner.nextInt();
            } if (idMenu == 6) {
                getOfBox(boxes);
                printMenu();
                idMenu = scanner.nextInt();
            }
        } while (idMenu !=7);

    }

    public static void infoOlderFortyYears(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < 1974) {
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

    public static void openBox(Box[] boxes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую коробку Вы хотите открыть? 1 - Большая (30х30х30), 2 - Средняя (20х20х20), " +
                "3 - Маленькая (10х10х10)");
        int idBox = scanner.nextInt();
        if (idBox == 1) {
            boxes[0].setCondition("открыта");
            System.out.println("Большая коробка открыта");
        }   if (idBox == 2) {
            boxes[1].setCondition("закрыта");
            System.out.println("Средняя коробка открыта");
        }   if (idBox == 3) {
            boxes[2].setCondition("открыта");
            System.out.println("Маленькая коробка открыта");
        }
    }

    public static void closeBox(Box[] boxes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую коробку Вы хотите закрыть? 1 - Большая (30х30х30), 2 - Средняя (20х20х20), " +
                "3 - Маленькая (10х10х10)");
        int idBox = scanner.nextInt();
        if (idBox == 1) {
            boxes[0].setCondition("закрыта");
            System.out.println("Большая коробка закрыта");
        }   if (idBox == 2) {
            boxes[1].setCondition("закрыта");
            System.out.println("Средняя коробка закрыта");
        }   if (idBox == 3) {
            boxes[2].setCondition("закрыта");
            System.out.println("Маленькая коробка закрыта");
        }
    }

    public static void changeColor(Box[] boxes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую коробку Вы хотите перекрасить? 1 - Большая (30х30х30), 2 - Средняя (20х20х20), " +
                "3 - Маленькая (10х10х10)");
        int idBox = scanner.nextInt();
        System.out.println("В какой цвет Вы хотите покрасить?");
        String color = scanner.next();
        if (idBox == 1) {
            boxes[0].setColor(color);
            System.out.println("Большая коробка перекрашена в " + color);
        }   if (idBox == 2) {
            boxes[1].setColor(color);
            System.out.println("Средняя коробка перекрашена в " + color);
        }   if (idBox == 3) {
            boxes[2].setColor(color);
            System.out.println("Маленькая коробка перекрашена в " + color);
        }
    }

    public static void putToBox(Box[] boxes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("В какую коробку Вы хотите положить? 1 - Большая (30х30х30), 2 - Средняя (20х20х20), " +
                "3 - Маленькая (10х10х10)");
        int idBox = scanner.nextInt();
        System.out.println("Что Вы хотите положить?");
        String thing = scanner.next();
        if (idBox == 1) {
            if (boxes[0].getFilling() != "пустая") {
                System.out.println("В большой коробке уже лежит " + boxes[0].getFilling());
                return;
            }
            boxes[0].setFilling(thing);
            System.out.println("В большой коробке лежит " + thing);
        }   if (idBox == 2) {
            if (boxes[1].getFilling() != "пустая") {
                System.out.println("В средней коробке уже лежит " + boxes[1].getFilling());
                return;
            }
            boxes[1].setFilling(thing);
            System.out.println("В средней коробке лежит " + thing);
        }   if (idBox == 3) {
            if (boxes[2].getFilling() != "пустая") {
                System.out.println("В маленькой коробке уже лежит " + boxes[2].getFilling());
                return;
            }
            boxes[2].setFilling(thing);
            System.out.println("В маленькой коробке лежит " + thing);
        }
    }

    public static void getOfBox(Box[] boxes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Из какой коробки Вы хотите достать предмет? 1 - Большая (30х30х30), 2 - Средняя (20х20х20), " +
                "3 - Маленькая (10х10х10)");
        int idBox = scanner.nextInt();
        if (idBox == 1) {
            if (boxes[0].getCondition() == "закрыта") {
                System.out.println("Большая коробка закрыта. Необходимо открыть коробку.");
                return;
            }
            boxes[0].setFilling("пустая");
            System.out.println("Большая коробка пустая");
        }   if (idBox == 2) {
            if (boxes[1].getCondition() == "закрыта") {
                System.out.println("Средняя коробка закрыта. Необходимо открыть коробку.");
                return;
            }
            boxes[1].setFilling("пустая");
            System.out.println("Средняя коробка пустая");
        }   if (idBox == 3) {
            if (boxes[2].getCondition() == "закрыта") {
                System.out.println("Маленькая коробка закрыта. Необходимо открыть коробку.");
                return;
            }
            boxes[2].setFilling("пустая");
            System.out.println("Маленькая коробка пустая");
        }
    }

}