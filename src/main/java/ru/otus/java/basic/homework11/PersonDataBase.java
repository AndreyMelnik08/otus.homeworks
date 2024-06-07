package ru.otus.java.basic.homework11;

import java.util.HashMap;
import java.util.Map;

public class PersonDataBase {

    private Map personMap;

    public Map getPersonMap() {
        return personMap;
    }

    public void setPersonMap(Map personMap) {
        this.personMap = personMap;
    }

    public PersonDataBase() {
        personMap = new HashMap<>();
    }

    public Person findById(Long id) {
        return (Person) personMap.get(id);
    }

    public void add(Person person) {
        personMap.put(person.id, person);
    }

    public boolean isManager(Position person) {
        Position position = person;
        return position == Position.MANAGER || position == Position.DIRECTOR || position == Position.BRANCH_DIRECTOR
                || position == Position.SENIOR_MANAGER;
    }

    public boolean isEmployee(Long id) {
        Person person = (Person) personMap.get(id);
        Position position = person.position;
        return position == Position.DRIVER || position == Position.ENGINEER || position == Position.DEVELOPER ||
                position == Position.QA || position == Position.JANITOR || position == Position.PLUMBER ||
                position == Position.JUNIOR_DEVELOPER;
    }

    @Override
    public String toString() {
        return "PersonDataBase{" +
                "personMap=" + personMap +
                '}';
    }
}

