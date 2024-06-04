package ru.otus.java.basic.homework10;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Мельник А.В.", "+79164690465");
        phoneBook.add("Рудой К.С.", "+7919999999");
        phoneBook.add("Рудой К.С.", "+7919888888");
        phoneBook.add("Мельник А.В.", "+79167777777");
        phoneBook.add("Мельник В.Ф.", "+79163964980");

        System.out.println(phoneBook.toString());
        System.out.println(phoneBook.find("Мельник А.В."));
        System.out.println(phoneBook.containsPhoneNumber("+79164690465"));

    }
}
