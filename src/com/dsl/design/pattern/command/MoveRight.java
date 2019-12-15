/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.command;

public class MoveRight implements IController
{
    private GameCharacter gameCharacter;

    public MoveRight(GameCharacter gameCharacter)
    {
        this.gameCharacter = gameCharacter;
    }

    @Override
    public void execute()
    {
        System.out.println(String.format("%s moved right", gameCharacter.getName()));
        gameCharacter.setMoveRightCount(gameCharacter.getMoveRightCount() + 1);
    }

    @Override
    public void unexecute()
    {
        System.out.println(String.format("%s unexecuted move right", gameCharacter.getName()));
        gameCharacter.setMoveRightCount(gameCharacter.getMoveRightCount() - 1);
    }
}
