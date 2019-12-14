/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.singleton;

import java.util.Objects;

public class MySingletonClass
{
    private MySingletonClass mySingletonClass;

    public MySingletonClass getInstance()
    {
        if(Objects.isNull(mySingletonClass))
        {
            System.out.println("Initialize MySingletonClass");
            mySingletonClass = new MySingletonClass();
        }
        return mySingletonClass;
    }
}
