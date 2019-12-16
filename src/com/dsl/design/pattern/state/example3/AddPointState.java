/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.state.example3;

public class AddPointState extends GameState
{
    public AddPointState(MyGame myGame)
    {
        super(myGame);
    }

    @Override
    public void getPoints()
    {
        myGame.setPoints(myGame.points() + 1);
        System.out.println("Added 1 point");
    }

    @Override
    public String getState()
    {
        return "Add Point State";
    }
}
