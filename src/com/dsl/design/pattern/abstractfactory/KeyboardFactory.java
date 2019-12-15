/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.abstractfactory;

public class KeyboardFactory
{
    private KeyboardFactory() {}

    public static IHardware create(String type)
    {
        switch (type)
        {
            case "gaming":
                return new GamingKeyboard();
            case "basic":
                return new BasicKeyboard();
            default:
                throw new UnsupportedOperationException();
        }
    }

}
