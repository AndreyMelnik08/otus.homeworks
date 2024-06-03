package ru.otus.java.basic.homework9;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    public List getEmployeeNames(List<Employee> employee) {
        List names = new ArrayList<>();
        for (Employee name : employee) {
            names.add(name.getName());
        }
        return names;
    }

    public List getEmployeeMinAge(List<Employee> employee, int minAge) {
        List minAgeEmployees = new ArrayList<>();
        for (Employee minAgeEmployee : employee) {
            if (minAgeEmployee.getAge() <= minAge) {
                minAgeEmployees.add(minAgeEmployee);
            }
        }
        return minAgeEmployees;
    }

    public boolean getEmployeeAverageAge(List<Employee> employee, int checkMinAge) {
        int averageAge = 0;
        for (Employee averageAgeEmployee : employee) {
            averageAge += averageAgeEmployee.getAge();
        }
        averageAge = averageAge / employee.size();
        if (averageAge >= checkMinAge) {
            return true;
        }
        return false;
    }

    public Employee getYoungestEmployee(List<Employee> employee) {
        Employee youngestEmployee = employee.get(0);
        for (Employee age : employee) {
            if (age.getAge() < youngestEmployee.getAge()) {
                youngestEmployee = age;
            }
        }
        return youngestEmployee;
    }

}
