/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.state.example2;

public class Start extends GameState
{
    public Start(MyGame myGame)
    {
        super(myGame);
    }

    @Override
    public void printState()
    {
        System.out.println("CURRENT STATE: Start Game");
    }
}
