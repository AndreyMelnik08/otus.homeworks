package ru.otus.java.basic.oophomework5.animals;

public class Cat extends Animal {

    public Cat(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
    }

    @Override
    public int swim (int distance) {
        int time = -1;
        System.out.println("Кот плавать не умеет");
        return time;
    }

}

