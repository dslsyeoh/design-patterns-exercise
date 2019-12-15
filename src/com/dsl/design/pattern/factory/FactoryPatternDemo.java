/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.factory;

public class FactoryPatternDemo
{
    public static void main(String[] args)
    {
        IShape triangle = ShapeFactory.create("triangle");
        triangle.draw();

        IShape circle = ShapeFactory.create("circle");
        circle.draw();
    }
}
