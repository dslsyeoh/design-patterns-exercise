/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.abstractfactory;

public class AbstractFactoryPatternDemo
{
    public static void main(String[] args)
    {
        IHardware mouse = HardwareFactory.create("mouse", true);
        mouse.create();

        IHardware mouse2 = HardwareFactory.create("mouse", false);
        mouse2.create();

        IHardware keyboard = HardwareFactory.create("keyboard", true);
        keyboard.create();

        IHardware keyboard2 = HardwareFactory.create("keyboard", false);
        keyboard2.create();
    }
}
