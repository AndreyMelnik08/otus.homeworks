package ru.otus.java.basic.homework10;

import java.util.*;

public class PhoneBook {

    private final Map<String, PhoneNumber> map = new HashMap<>();
    private String fullName;

    public void add(String fullName, String number) {
        if (!map.containsKey(fullName)) {
            map.put(fullName, new PhoneNumber(number));
        }
        if (map.containsKey(fullName)) {
            map.get(fullName).addNumber(number);
        }
    }

    public Set<String> find(String name) {
        if (map.containsKey(name)) {
            return map.get(name).getPhoneNumber();
        } else {
            return null;
        }
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (PhoneNumber phoneNumbers : map.values()) {
            if (phoneNumbers.getPhoneNumber().contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }

    public PhoneBook() {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Телефоная книга: " + map;
    }
}

