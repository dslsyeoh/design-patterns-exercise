/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.command;

public class MoveBackward implements IController
{
    private GameCharacter gameCharacter;

    public MoveBackward(GameCharacter gameCharacter)
    {
        this.gameCharacter = gameCharacter;
    }

    @Override
    public void execute()
    {
        System.out.println(String.format("%s moved backward", gameCharacter.getName()));
        gameCharacter.setMoveBackwardCount(gameCharacter.getMoveBackwardCount() + 1);
    }

    @Override
    public void unexecute()
    {
        System.out.println(String.format("%s unexecuted move backward", gameCharacter.getName()));
        gameCharacter.setMoveBackwardCount(gameCharacter.getMoveBackwardCount() - 1);
    }
}
