package ru.otus.java.basic.oophomework7;
//Создайте класс Человек с полями name (имя) и currentTransport (текущий транспорт)
//Реализуйте в вашем приложении классы Машина, Лошадь, Велосипед, Вездеход
//Каждый из классов должен предоставлять возможность перемещаться на определенное расстояние с указанием типа местности
//В приложении должны быть типы местности: густой лес, равнина, болото
//Человек должен иметь возможность сесть на любой из этих видов транспорта, встать с него, или переместиться на
// некоторое расстояние (при условии что он находится на каком-либо транспорте)
//При попытке выполнить перемещение у человека, не использующего транспорт, считаем что он
// просто идет указанное расстояние пешком
//При перемещении Машина и Вездеход тратят бензин, который у них ограничен. Лошадь тратит силы. Велосипед может
// использоваться без ограничений (можете для усложнения велосипедом тратить силы “водителя”).
// При выполнении действия результат должен быть отпечатан в консоль
//У каждого вида транспорта есть местности по которым он не может перемещаться: машина - густой лес и болото,
// лошадь и велосипед - болото, вездеход - нет ограничений
//При попытке переместиться должен быть возвращен результат true/false - удалось ли выполнить действие

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Car car = new Car();
        Horse horse = new Horse();
        Bike bike = new Bike();
        OffRoadCar offRoadCar = new OffRoadCar();
        Transport transport = new Transport() {
            @Override
            public boolean travel(int location, int distance) {
                return Transport.super.travel(location, distance);
            }
        };

        Scanner scanner = new Scanner(System.in);
        int distance;
        int idTransport;
        Human human = new Human("Кристина", "Без транспорта");
        printMenu();
        int idMenu = scanner.nextInt();

        do {
            if (idMenu == 1) {
                System.out.println("На чем вы хотите поехать? 1 - Машина, 2 - Лошадь, 3 - Велосипед, 4 - Вездеход");
                // выбираем транспорт
                idTransport = scanner.nextInt();
                human.choiceTransport(idTransport);
            } if (idMenu == 2) {
                System.out.println("На какой транспорт вы хотите пересесть? 1 - Машина, 2 - Лошадь, 3 - Велосипед, " +
                        "4 - Вездеход");
                idTransport = scanner.nextInt();
                human.choiceTransport(idTransport);
            } if (idMenu == 3) {
                human.outTransport();
            } if (idMenu == 4) {
                System.out.println("По какой местности будет маршрут? 1 - Густой лес, 2 - Равнина, 3 - Болото");
                int location = scanner.nextInt();
                System.out.println("Укажите расстояние в метрах");
                distance = scanner.nextInt();
                if (human.getCurrentTransport().equals("Машина")) {
                    car.travel(location, distance);
                } if (human.getCurrentTransport().equals("Лошадь")) {
                    horse.travel(location, distance);
                } if (human.getCurrentTransport().equals("Велосипед")) {
                    bike.travel(location, distance);
                } if (human.getCurrentTransport().equals("Вездеход")) {
                    offRoadCar.travel(location, distance);
                } if (human.getCurrentTransport().equals("Без транспорта")) {
                    transport.travel(location, distance);
                }
            } if (idMenu == 5) {
                // выводим информацию о каждом транспорте
                human.info();
                car.info();
                offRoadCar.info();
                horse.info();
                bike.info();
            }
            printMenu();
            idMenu = scanner.nextInt();
        } while (idMenu !=6);
    }

    public static void printMenu () {
        System.out.println("1. Выбрать транспорт");
        System.out.println("2. Поменять транспорт");
        System.out.println("3. Слезть с транспорта");
        System.out.println("4. Совершить поездку");
        System.out.println("5. Вывести текущую информацию");
        System.out.println("6. Выйти");
    }

}