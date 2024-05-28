package ru.otus.java.basic.oophomework7;

public class OffRoadCar implements Transport{

    private int fuel = 500000;

    @Override
    public boolean travel(int location, int distance) {
        if (location == 1) {
            if (distance <= fuel) {
                fuel -= distance;
                System.out.println("Вы проехали по густому лесу " + distance + "м");
                System.out.println("У вездеходе осталось бензина: " + fuel);
            } else {
                System.out.println("Недостаточно бензина");
            }
        } if (location == 2) {
            if (distance <= fuel) {
                fuel -= distance;
                System.out.println("Вы проехали по равнине " + distance + "м");
                System.out.println("У вездеходе осталось бензина: " + fuel);
            } else {
                System.out.println("Недостаточно бензина");
            }
        } if (location == 3) {
            if (distance <= fuel) {
                fuel -= distance;
                System.out.println("Вы проехали по болоту " + distance + "м");
                System.out.println("У вездеходе осталось бензина: " + fuel);
            } else {
                System.out.println("Недостаточно бензина");
            }
        }
        return true;
    }

    public void info () {
        System.out.println("У вездехода осталось бензина: " + fuel);
    }

}
