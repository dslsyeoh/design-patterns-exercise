/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.decorator;

import java.util.stream.Stream;

public class DecoratorPatternDemo
{
    public static void main(String[] args)
    {
        Operation operation1 = new Additional(new Calculator());
        Operation operation2 = new Multiplication(new Calculator());
        Operation operation3 = new Additional(new Multiplication(new Calculator()));
        Operation operation4 = new Additional(new Additional(new Additional(new Calculator())));
        Operation operation5 = new Additional(new Multiplication(new Additional(new Multiplication(new Calculator()))));
        Operation operation6 = new Additional(3, 3, new Multiplication(new Additional(new Multiplication(2, 5, new Calculator()))));

        Stream.of(operation1, operation2, operation3, operation4, operation5, operation6)
                .map(operation -> String.format("Total: %.2f", operation.compute()))
                .forEach(System.out::println);
    }
}
