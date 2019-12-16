/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.state.example3;

public abstract class GameState
{
    MyGame myGame;

    public GameState(MyGame myGame)
    {
        this.myGame = myGame;
    }

    public abstract void getPoints();

    public abstract String getState();
}
