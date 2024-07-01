package ru.otus.java.basic.homework11;

public class MainApp {
    public static void main(String[] args) {

        PersonDataBase personDataBase = new PersonDataBase();

        personDataBase.add(new Person("Андрей", Position.BRANCH_DIRECTOR, 1L));
        personDataBase.add(new Person("Кристина", Position.DIRECTOR, 2L));
        personDataBase.add(new Person("Федор", Position.ENGINEER, 3L));
        personDataBase.add(new Person("Алиса", Position.DEVELOPER, 4L));
        personDataBase.add(new Person("Настя", Position.SENIOR_MANAGER, 5L));
        personDataBase.add(new Person("Ryan Gosling", Position.DRIVER, 6L));

        System.out.println(personDataBase);

        System.out.println(personDataBase.isManager(Position.BRANCH_DIRECTOR));
        System.out.println(personDataBase.isEmployee(5L));
        System.out.println(personDataBase.findById(1L));

    }
}
