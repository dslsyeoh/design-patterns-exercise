/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.state.example2;

public class MyGame
{
    private GameState gameState;

    private Start START = new Start();
    private Wait WAITING = new Wait();
    private Restart RESTART = new Restart();
    private GameOver GAME_OVER = new GameOver();

    public void test()
    {
        gameState = START;
        gameState.printState();
        System.out.println("Playing...");
        System.out.println("Character died");
        gameState = WAITING;
        gameState.printState();
        System.out.println("Do you want to restart? Yes");
        gameState = RESTART;
        gameState.printState();
        System.out.println("Playing...");
        System.out.println("Character died");
        gameState = WAITING;
        gameState.printState();
        System.out.println("Do you want to restart? No");
        gameState = GAME_OVER;
        gameState.printState();
    }
}
