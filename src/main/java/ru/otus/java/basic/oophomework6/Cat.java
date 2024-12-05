package ru.otus.java.basic.oophomework6;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void info () {
        System.out.println("Котик " + name + ", аппетит " + appetite + ", сытость: " + satiety);
    }

    public void eat (Plate plate) {
        if (!satiety) {
            if (plate.decreaseFood(appetite)) {
                System.out.println(name + " покушал");
                satiety = true;
            }
        } else {
            System.out.println(name + " Сытость: " + satiety);
        }
    }

}