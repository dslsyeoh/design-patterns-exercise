/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.command;

public class GameCharacter
{
    private String name;
    private int moveForwardCount;
    private int moveLeftCount;
    private int moveRightCount;
    private int moveBackwardCount;

    public GameCharacter() {}

    public GameCharacter(String name)
    {
        this.name = name;
        this.moveForwardCount = 0;
        this.moveLeftCount = 0;
        this.moveRightCount = 0;
        this.moveBackwardCount = 0;
    }

    public String getName()
    {
        return name;
    }

    public int getMoveForwardCount()
    {
        return moveForwardCount;
    }

    public void setMoveForwardCount(int moveForwardCount)
    {
        this.moveForwardCount = moveForwardCount;
    }

    public int getMoveLeftCount()
    {
        return moveLeftCount;
    }

    public void setMoveLeftCount(int moveLeftCount)
    {
        this.moveLeftCount = moveLeftCount;
    }

    public int getMoveRightCount()
    {
        return moveRightCount;
    }

    public void setMoveRightCount(int moveRightCount)
    {
        this.moveRightCount = moveRightCount;
    }

    public int getMoveBackwardCount()
    {
        return moveBackwardCount;
    }

    public void setMoveBackwardCount(int moveBackwardCount)
    {
        this.moveBackwardCount = moveBackwardCount;
    }
}
