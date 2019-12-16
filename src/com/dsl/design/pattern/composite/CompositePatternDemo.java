/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.composite;

import java.util.stream.Stream;

public class CompositePatternDemo
{
    public static void main(String[] args)
    {
        Developer developer = new Developer("Tom", 8000, "Team Leader");
        Developer developer2 = new Developer("Sam", 6000, "Senior Developer");
        Developer developer3 = new Developer("Bob", 4000, "Developer");
        Developer developer4 = new Developer("King", 3000, "Junior Developer");
        Developer developer5 = new Developer("Chris", 3000, "Junior Developer");

        Salesman salesman = new Salesman("Paul", 5000, "Executive Salesman");
        Salesman salesman2 = new Salesman("Crux", 3000, "Salesman");
        Salesman salesman3 = new Salesman("Mark", 3000, "Salesman");

        Manager manager = new Manager("Max", 6500, "Project Manager");
        Manager manager2 = new Manager("Isabelle", 6000, "Marketing Manager");

        Stream.of(developer, developer2, developer3, developer4, developer5).forEach(manager::addEmployee);
        Stream.of(salesman, salesman2, salesman3).forEach(manager2::addEmployee);

        manager.printDetails();

        manager2.removeEmployee(salesman2);
        manager2.printDetails();
    }
}
