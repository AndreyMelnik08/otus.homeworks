package ru.otus.java.basic.oophomework5.animals;

public class Dog extends Animal {

    public Dog(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
    }

    @Override
    public int swim (int distance) {
        int time;
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

