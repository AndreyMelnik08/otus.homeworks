package ru.otus.java.basic.animals;

public class Cat extends Animal {

    public Cat(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
    }

    @Override
    public int run (int distance) {
        if (endurance >= distance) {
            time = distance / runningSpeed;
            endurance = endurance - distance;
            System.out.println("пробежал " + distance + "м за " + time + " секунд");
        } else {
            distance = endurance;
            time = distance / runningSpeed;
            endurance = 0;
            System.out.println(name + " устал и смог пробежать " + distance + "м за " + time + " секунд");
            time = -1;
        }
        return time;
    }

    @Override
    public int swim (int distance) {
        System.out.println("Кот плавать не умеет");
        return time;
    }

}
