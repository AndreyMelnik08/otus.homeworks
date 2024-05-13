package ru.otus.java.basic.animals;

public class Dog extends Animal {

    public Dog(String name, int runningSpeed, int swimmingSpeed, int endurance) {
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
        if (endurance >= (distance * 2)) {
            time = distance / swimmingSpeed;
            endurance = endurance - distance * 2;
            System.out.println("проплыл " + distance + "м за " + time + " секунд");
        } else {
            distance = endurance / 2;
            time = distance / runningSpeed;
            endurance = 0;
            System.out.println(name + " устал и смог проплыть " + distance + "м за " + time + " секунд");
            time = -1;
        }
        return time;
    }

}
