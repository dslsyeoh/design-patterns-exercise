/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.factory;

public class Triangle implements IShape
{
    @Override
    public void draw()
    {
        System.out.println("Draw triangle");
    }
}
