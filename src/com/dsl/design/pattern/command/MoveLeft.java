/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.command;

public class MoveLeft implements IController
{
    private GameCharacter gameCharacter;

    public MoveLeft(GameCharacter gameCharacter)
    {
        this.gameCharacter = gameCharacter;
    }

    @Override
    public void execute()
    {
        System.out.println(String.format("%s moved left", gameCharacter.getName()));
        gameCharacter.setMoveLeftCount(gameCharacter.getMoveLeftCount() + 1);
    }

    @Override
    public void unexecute()
    {
        System.out.println(String.format("%s unexecuted move left", gameCharacter.getName()));
        gameCharacter.setMoveLeftCount(gameCharacter.getMoveLeftCount() - 1);
    }
}
