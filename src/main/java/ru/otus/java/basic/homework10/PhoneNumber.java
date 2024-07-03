package ru.otus.java.basic.homework10;

import java.util.HashSet;
import java.util.Set;

public class PhoneNumber {

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = new HashSet<>();
    }

    private Set<String> phoneNumber = new HashSet<>();

    public Set<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Set<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addNumber(String number) {
        phoneNumber.add(number);
    }

    @Override
    public String toString() {
        return "Номер телефона: " + phoneNumber;
    }
}
