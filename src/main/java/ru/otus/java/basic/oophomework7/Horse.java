package ru.otus.java.basic.oophomework7;

public class Horse implements Transport{

    private int endurance = 500000;

    @Override
    public boolean travel(int location, int distance) {
        if (location == 1) {
            if (distance <= endurance) {
                endurance -= distance;
                System.out.println("Вы проехали по густому лесу " + distance + "м");
                System.out.println("У лошадки осталось сил: " + endurance);
            } else {
                System.out.println("Лошадь устала и не может проехать такое расстояние");
                return false;
            }
        } if (location == 2) {
            if (distance <= endurance) {
                endurance -= distance;
                System.out.println("Вы проехали по равнине " + distance + "м");
                System.out.println("У лошадки осталось сил: " + endurance);
            } else {
                System.out.println("Лошадь устала и не может проехать такое расстояние");
                return false;
            }
        } if (location == 3) {
            System.out.println("Лошадь не может перемещаться в болоте");
            return false;
        }
        return true;
    }

    public void info () {
        System.out.println("У лошади осталось сил: " + endurance);
    }

}
