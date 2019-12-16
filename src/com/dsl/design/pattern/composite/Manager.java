/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee
{
    private String name;
    private double salary;
    private String position;
    private List<Employee> employees;

    public Manager(String name, double salary, String position)
    {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee)
    {
        employees.remove(employee);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public String getPosition()
    {
        return position;
    }

    public List<Employee> getEmployees()
    {
        return employees;
    }

    @Override
    public void printDetails()
    {
        System.out.println("=============== Management ===============");
        System.out.println(String.format("Name: %s Salary: %.2f Position: %s", name, salary, position));
        System.out.println("=============== Management ===============");
        employees.forEach(Employee::printDetails);
        System.out.println();
    }
}
