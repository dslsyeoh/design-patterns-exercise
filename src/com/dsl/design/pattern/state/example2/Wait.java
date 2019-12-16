/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.state.example2;

public class Wait extends GameState
{
    public Wait(MyGame myGame)
    {
        super(myGame);
    }

    @Override
    public void printState()
    {
        System.out.println("CURRENT STATE: Waiting user decision");
    }
}
