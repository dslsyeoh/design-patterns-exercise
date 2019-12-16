/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.state.example3;

public class LosePointState extends GameState
{
    public LosePointState(MyGame myGame)
    {
        super(myGame);
    }

    @Override
    public void getPoints()
    {
        myGame.setPoints(myGame.points() - 1);
        System.out.println("Lose 1 point");
    }

    @Override
    public String getState()
    {
        return "Lose Point State";
    }
}
