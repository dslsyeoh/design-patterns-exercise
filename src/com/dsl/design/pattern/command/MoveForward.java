/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.command;

public class MoveForward implements IController
{
    private GameCharacter gameCharacter;

    public MoveForward(GameCharacter gameCharacter)
    {
        this.gameCharacter = gameCharacter;
    }

    @Override
    public void execute()
    {
        System.out.println(String.format("%s moved forward", gameCharacter.getName()));
        gameCharacter.setMoveForwardCount(gameCharacter.getMoveForwardCount() + 1);
    }

    @Override
    public void unexecute()
    {
        System.out.println(String.format("%s unexecuted move forward", gameCharacter.getName()));
        gameCharacter.setMoveForwardCount(gameCharacter.getMoveForwardCount() - 1);
    }
}
