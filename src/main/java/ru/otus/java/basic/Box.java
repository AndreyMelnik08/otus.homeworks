package ru.otus.java.basic;

public class Box {

    // Попробуйте реализовать класс по его описанию: объекты класса Коробка должны иметь размеры и цвет.
    // Коробку можно открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после создания нельзя.
    // У коробки должен быть метод, печатающий информацию о ней в консоль. В коробку можно складывать предмет
    // (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть), только при условии
    // что коробка открыта (предметом читаем просто строку). Выполнение методов должно сопровождаться
    // выводом сообщений в консоль.

    private String size;
    private String color;
    private String condition; // параметр, который показывает открыта коробка или нет
    private String filling; // наполнение

    public Box(String size, String color, String condition, String filling) {
        this.size = size;
        this.color = color;
        this.condition = condition;
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

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void info() {
        System.out.println("Информация о коробке: размер " + this.size +
                ", цвет " + this.color + ", крышка " + this.condition +
                ", наполнение: " + this.filling);
    }
}
