package ru.otus.java.basic.oophomework7;

public class Human {

    private String name;
    private String currentTransport;

    public Human(String name, String currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport(String currentTransport) {
        this.currentTransport = currentTransport;
    }

    public void info () {
        System.out.println(name + " cейчас использует транспорт: " + currentTransport);
    }

    public void choiceTransport(int idTransport) {
        if (idTransport == 1 ) {
            currentTransport = "Машина";
        } if (idTransport == 2 ) {
            currentTransport = "Лошадь";
        } if (idTransport == 3) {
            currentTransport = "Велосипед";
        } if (idTransport == 4) {
            currentTransport = "Вездеход";
        }
        System.out.println("Ваш транспорт " + currentTransport);
    }

    public void outTransport () {
        currentTransport = "Без транспорта";
        System.out.println(name + " сошла с транспорта");
    }

}
