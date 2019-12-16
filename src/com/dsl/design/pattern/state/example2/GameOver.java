/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.state.example2;

public class GameOver extends GameState
{
    @Override
    public void printState()
    {
        System.out.println("CURRENT STATE: Game Over!");
    }
}
