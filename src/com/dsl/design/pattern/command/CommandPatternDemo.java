/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.command;

public class CommandPatternDemo
{
    public static void main(String[] args)
    {
        GameCharacter gameCharacter = new GameCharacter("My Character");
        MoveForward moveForward = new MoveForward(gameCharacter);
        MoveLeft moveLeft = new MoveLeft(gameCharacter);
        MoveRight moveRight = new MoveRight(gameCharacter);
        MoveBackward moveBackward = new MoveBackward(gameCharacter);

        moveForward.execute();
        moveForward.execute();
        moveForward.execute();

        moveForward.unexecute();
        moveForward.unexecute();

        moveLeft.execute();
        moveRight.execute();

        moveBackward.execute();
        moveBackward.unexecute();

        moveLeft.execute();
        moveRight.execute();


        System.out.println("\n========== Character Movements Counter ==========");
        System.out.println("Move forward count: " + gameCharacter.getMoveForwardCount());
        System.out.println("Move left count: " + gameCharacter.getMoveLeftCount());
        System.out.println("Move right count: " + gameCharacter.getMoveRightCount());
        System.out.println("Move backward count: " + gameCharacter.getMoveBackwardCount());
        System.out.println("========== Character Movements Counter ==========");
    }
}
