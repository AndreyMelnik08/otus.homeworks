package ru.otus.java.basic.oophomework5.animals;


public class Animal {
    protected String name;
    protected int runningSpeed;
    protected int swimmingSpeed;
    protected int endurance;
    protected int distance;

    public Animal(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(int runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public double getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void info() {
        System.out.println("Состояние " + name + ". Скорость бега: " + runningSpeed + " м/с" + ". Скорость плавания " +
                swimmingSpeed + " м/с" + ". Текущая выносливость: " + endurance);
    }

    public int run (int distance) {
        int time;
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

    public int swim(int distance) {
        int time = 0;
        return time;
    }

}

