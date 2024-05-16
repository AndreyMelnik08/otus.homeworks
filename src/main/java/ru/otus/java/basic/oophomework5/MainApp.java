package ru.otus.java.basic.oophomework5;


//Создайте классы Cat, Dog и Horse с наследованием от класса Animal
//У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах)
//Затраты выносливости:
//Все животные на 1 метр бега тратят 1 ед выносливости,
//Собаки на 1 метр плавания - 2 ед.
//Лошади на 1 метр плавания тратят 4 единицы
//Кот плавать не умеет.
//Реализуйте методы run(int distance) и swim(int distance), которые должны возвращать время, затраченное на
//указанное действие, и “понижать выносливость” животного. Если выносливости не хватает, то возвращаем время -1 и
//указываем что у животного появилось состояние усталости. При выполнении действий пишем сообщения в консоль.
//Добавляем метод info(), который выводит в консоль состояние животного.

//Скорость бега кота - 8 м/с
//Скорость бега лошади 15 м/с
//Скорость бега собаки 6 м/с
//Скорость плавания лошади 2 м/с
//Скорость плавания собаки 1 м/с

import ru.otus.java.basic.oophomework5.animals.Animal;
import ru.otus.java.basic.oophomework5.animals.Cat;
import ru.otus.java.basic.oophomework5.animals.Dog;
import ru.otus.java.basic.oophomework5.animals.Horse;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Animal[] animals = {new Cat("Кокос", 8, 0, 4000),
                new Dog("Клюква", 6, 1, 5000),
                new Horse("Персик", 15, 2, 50000)
        };

        printMenu();
        int idMenu = scanner.nextInt();
        do {
            if (idMenu == 1) {
                info(animals);
                printMenu();
                idMenu = scanner.nextInt();
            } if (idMenu ==2) {
                System.out.println("Кто побежит? 1 - Кокос, 2 - Клюква, 3 - Персик");
                int choseAnimal = scanner.nextInt();
                System.out.println("Укажите дистанцию");
                int distance = scanner.nextInt();
                animals[choseAnimal-1].run(distance);
                idMenu = scanner.nextInt();
            } if (idMenu == 3) {
                System.out.println("Кто поплывет? 1 - Кокос, 2 - Клюква, 3 - Персик");
                int choseAnimal = scanner.nextInt();
                System.out.println("Укажите дистанцию");
                int distance = scanner.nextInt();
                animals[choseAnimal-1].swim(distance);
                idMenu = scanner.nextInt();
            }
        } while (idMenu != 4);

    }

    public static void info (Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            animals[i].info();
        }
    }

    public static void printMenu () {
        System.out.println("Какое действие Вы хотите совершить?");
        System.out.println("1. Вывести информацию о животных");
        System.out.println("2. Животное пробежит");
        System.out.println("3. Животное проплывет");
        System.out.println("4. Выйти");
    }

}