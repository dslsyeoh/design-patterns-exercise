/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.state.example1;

public class RestartState implements State
{
    @Override
    public void printCurrentState()
    {
        System.out.println("CURRENT STATE: Restart Game");
    }
}
