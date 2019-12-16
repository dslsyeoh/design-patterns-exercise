/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.state.example1;

public class StatePatternDemo
{
    public static void main(String[] args)
    {
        StartState startState = new StartState();
        WaitingState waitingState = new WaitingState();
        RestartState restartState = new RestartState();
        GameOverState gameOverState = new GameOverState();

        GameState gameState = new GameState(startState);
        gameState.printCurrentState();
        System.out.println("Playing...");
        System.out.println("Character died");
        gameState.setState(waitingState);
        gameState.printCurrentState();
        System.out.println("Do you want to restart? Yes");
        gameState.setState(restartState);
        gameState.printCurrentState();
        System.out.println("Playing...");
        System.out.println("Character died");
        gameState.setState(waitingState);
        gameState.printCurrentState();
        System.out.println("Do you want to restart? No");
        gameState.setState(gameOverState);
        gameState.printCurrentState();
    }
}
