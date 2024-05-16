package ru.otus.java.basic.oophomework6;

public class Cat {

    private String name;
    private boolean appetite;

    public Cat(String name, boolean appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAppetite() {
        return appetite;
    }

    public void setAppetite(boolean appetite) {
        this.appetite = appetite;
    }

    public void info () {
        if (appetite) {
            System.out.println("Котик " + name + " сытый");
        } else {
            System.out.println("Котик " + name + " голоден");
        }
    }

    public void eat (Plate plate) {
        if (!appetite) {
            if (plate.decreaseFood(30)) {
                System.out.println(name + " покушал");
                appetite = true;
            }
        } else
            System.out.println(name + " сытый");
    }

}