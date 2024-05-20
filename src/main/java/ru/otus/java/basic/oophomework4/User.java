package ru.otus.java.basic.oophomework4;

public class User {

    //Создайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email;
    //Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта;
    //В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе в виде:
    //ФИО: фамилия имя отчество
    //Год рождения: год рождения
    //e-mail: email

    private String surname;
    private String name;
    private String patronymic;
    private int birthDate;
    private String email;

    public User(String surname, String name, String patronymic, int birthDate, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.email = email;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void info() {
        System.out.println("ФИО: " + this.surname + " " + this.name + " " + this.patronymic);
        System.out.println("Год рождения: " + this.birthDate);
        System.out.println("e-mail: " + this.email);
    }
}
