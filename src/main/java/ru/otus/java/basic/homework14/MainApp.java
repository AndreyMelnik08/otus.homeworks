package ru.otus.java.basic.homework14;

public class MainApp {

    public static void main(String[] args) {

        Threads threads = new Threads();
        MainWork mainWork = new MainWork();

        long timeMainWork = mainWork.timeMainWork();
        long timeThreads = threads.timeThreads();

        System.out.println("Время основной работы: " + timeMainWork + " мс");
        System.out.println("Время в 4 потока: " + timeThreads + " мс");
        System.out.println("Выполнение работы в 4 потока быстрее в " + timeMainWork / timeThreads + " раз");
    }
}

