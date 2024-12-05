package ru.otus.java.basic.oophomework6;

public class Plate {

    private int volume;
    private int food;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int volume, int food) {
        this.volume = volume;
        this.food = food;
    }

    public void addFood (int amount) {
        if ((food + amount) > volume) {
            food = volume;
            System.out.println("Тарелка полная, всего еды: " + volume);
            System.out.println("Не удалось положть доложить еды " + (amount));
        } else {
            food += amount;
            System.out.println("В тарелке еды: " + food);
        }
    }

    public boolean decreaseFood (int appetite) {
        if (appetite > food) {
            System.out.println("В тарелке недостаточно еды");
            return false;
        } else {
            food -= appetite;
            return true;
        }
    }

    public void info () {
        System.out.println("Макс. объем: " + volume + " В тарелке еды: " + food);
    }

}