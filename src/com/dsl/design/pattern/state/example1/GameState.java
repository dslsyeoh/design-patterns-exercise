/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.state.example1;

public class GameState implements State
{
    private State state;

    public GameState(State state)
    {
        this.state = state;
    }

    @Override
    public void printCurrentState()
    {
        state.printCurrentState();
    }

    public void setState(State state)
    {
        this.state = state;
    }
}
