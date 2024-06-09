package ru.otus.java.basic.homework11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonDataBase {

    private Map personMap;

    List<Position> managerPositions = Arrays.asList(Position.MANAGER, Position.DIRECTOR, Position.BRANCH_DIRECTOR,
            Position.SENIOR_MANAGER);

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
        return managerPositions.contains(person);
    }

    public boolean isEmployee(Long id) {
        Person person = (Person) personMap.get(id);
        return !managerPositions.contains(person.position);
    }

    @Override
    public String toString() {
        return "PersonDataBase{" +
                "personMap=" + personMap +
                '}';
    }
}

