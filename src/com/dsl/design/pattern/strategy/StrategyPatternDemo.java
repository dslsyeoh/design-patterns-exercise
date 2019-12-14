/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.strategy;

public class StrategyPatternDemo
{
    public static void main(String[] args)
    {
        IStock iStock = new StockImpl();
        System.out.println("============== List of stocks ==============");
        iStock.list().forEach(System.out::println);
        System.out.println("============== List of stocks ==============");
    }
}
