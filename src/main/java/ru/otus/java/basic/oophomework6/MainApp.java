package ru.otus.java.basic.oophomework6;

public class MainApp {
    public static void main(String[] args) {

        Cat[] cats = { new Cat ("Мегатрон", 30, false),
                new Cat ("Корс", 30, false),
                new Cat ("Дионис", 30, false) };

        Plate plate = new Plate(50,50);

        info(cats);
        cats[0].eat(plate);
        plate.info();
        cats[1].eat(plate);
        info(cats);
        plate.addFood(60);
        cats[2].eat(plate);
        info(cats);
        plate.info();
        cats[1].eat(plate);
        plate.info();
        info(cats);

    }

    public static void info (Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        }
    }

}
