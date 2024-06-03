package ru.otus.java.basic.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        OperationsWithArrays operationsWithArrays = new OperationsWithArrays();
        List<Integer> arrayListOne = new ArrayList<>();

        System.out.println(operationsWithArrays.selectMinMax(arrayListOne, 2, 8));
        List<Integer> arrayListTwo = Arrays.asList(1, 5, 6, 8, 1, 5, 6, 9, 4, 7, 8);
        System.out.println(operationsWithArrays.sumElements(arrayListTwo));
        operationsWithArrays.changeElements(arrayListTwo, 10);
        operationsWithArrays.increaseElements(arrayListTwo, 5);

        ArrayList<Employee> employee = new ArrayList<>();
        EmployeeList employeeList = new EmployeeList();

        employee.add(new Employee("Кристина", 24));
        employee.add(new Employee("Андрей", 30));
        employee.add(new Employee("Федор", 30));
        employee.add(new Employee("Анастасия", 30));
        employee.add(new Employee("Алиса", 32));

        System.out.println(employeeList.getEmployeeNames(employee));
        System.out.println(employeeList.getEmployeeMinAge(employee, 25));
        System.out.println(employeeList.getEmployeeAverageAge(employee, 27));
        System.out.println(employeeList.getYoungestEmployee(employee));

    }
}

