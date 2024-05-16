package ru.otus.java.basic.oophomework4;

public class Box {

    // Попробуйте реализовать класс по его описанию: объекты класса Коробка должны иметь размеры и цвет.
    // Коробку можно открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после создания нельзя.
    // У коробки должен быть метод, печатающий информацию о ней в консоль. В коробку можно складывать предмет
    // (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть), только при условии
    // что коробка открыта (предметом читаем просто строку). Выполнение методов должно сопровождаться
    // выводом сообщений в консоль.

    private String size;
    private String color;
    private boolean isOpened; // параметр, который показывает открыта коробка или нет
    private String filling; // наполнение

    public Box(String size, String color, boolean isOpened, String filling) {
        this.size = size;
        this.color = color;
        this.isOpened = isOpened;
        this.filling = filling;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String color) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void info() {
        System.out.println("Информация о коробке: размер " + size +
                ", цвет " + color + ", крышка " + isOpened +
                ", наполнение: " + filling);
    }

    public boolean open () {
        isOpened = true;
        System.out.println("Коробка " + size + " открыта");
        return isOpened;
    }

    public boolean close () {
        isOpened = false;
        System.out.println("Коробка " + size + " закрыта");
        return isOpened;
    }

    public void changeColor () {
        System.out.println("Коробка " + size + " перекрашена в " + color);
    }

    public void put () {
        System.out.println("В коробке " + size + " лежит " + filling);
    }

    public void get () {
        filling = "пустая";
        System.out.println("Коробка " + size + " " + filling);
    }

}

