package ru.otus.java.basic.oophomework7;

public class Car implements Transport{
    // 1 - Густой лес, 2 - Равнина, 3 - Болото

    private int fuel = 500000;

    @Override
    public boolean travel(int location, int distance) {
        if (location == 1) {
            System.out.println("Машина не может ехать по густому лесу");
            return false;
        } if (location == 2) {
            if (distance <= fuel) {
                fuel -= distance;
                System.out.println("Вы проехали по равнине " + distance + "м");
                System.out.println("В машине осталось бензина: " + fuel);
            } else {
                System.out.println("Недостаточно бензина");
                return false;
            }
        } if (location == 3) {
            System.out.println("Машина не может ехать в болоте");
            return false;
        }
        return true;
    }

    public void info () {
        System.out.println("В машине осталось бензина: " + fuel);
    }

}
