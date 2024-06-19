package ru.otus.java.basic.homework11;

import java.util.HashMap;
import java.util.Map;

public class PersonDataBase {

    private Map personMap;

    Map<Integer, Position> managerMap = new HashMap<>() {
        {
            put(1, Position.BRANCH_DIRECTOR);
            put(2, Position.DIRECTOR);
            put(3, Position.SENIOR_MANAGER);
            put(4, Position.MANAGER);
        }
    };

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
        return managerMap.containsValue(person);
    }

    public boolean isEmployee(Long id) {
        Person person = (Person) personMap.get(id);
        return !managerMap.containsValue(person.position);
    }

    @Override
    public String toString() {
        return "PersonDataBase{" +
                "personMap=" + personMap +
                '}';
    }
}

