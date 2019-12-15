/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.abstractfactory;

public class HardwareFactory
{
    private HardwareFactory() {}

    public static IHardware create(String type, boolean isGaming)
    {
        String itemType = isGaming ? "gaming" : "basic";
        switch (type)
        {
            case "mouse":
                return MouseFactory.create(itemType);
            case "keyboard":
                return KeyboardFactory.create(itemType);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
