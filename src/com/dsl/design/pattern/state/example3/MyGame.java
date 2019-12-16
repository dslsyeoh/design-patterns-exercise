/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.state.example3;

import java.util.stream.IntStream;

public class MyGame
{
    private int points;

    private GameState gameState;

    private AddPointState ADD_POINT = new AddPointState(this);
    private LosePointState LOSE_POINT = new LosePointState(this);

    public MyGame(int points)
    {
        this.points = points;
    }

    public int points()
    {
        return points;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }

    public void test()
    {
        gameState = ADD_POINT;
        IntStream.range(0, 3).forEach(i -> gameState.getPoints());
        System.out.println(String.format("Current state: %s, point: %d", gameState.getState(), points));
        gameState = LOSE_POINT;
        IntStream.range(0, 2).forEach(i -> gameState.getPoints());
        System.out.println(String.format("Current state: %s, point: %d", gameState.getState(), points));
    }

}
