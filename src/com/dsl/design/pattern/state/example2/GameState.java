/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.state.example2;

public abstract class GameState
{
    private MyGame myGame;

    public GameState(MyGame myGame)
    {
        this.myGame = myGame;
    }

    public abstract void printState();

    public MyGame getMyGame()
    {
        return myGame;
    }
}
