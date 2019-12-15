/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.facade;

public class FacadePatternDemo
{
    public static void main(String[] args)
    {
        Account account = new Account(200);
        IBank bank = new Bank(account);
        bank.withdraw(180);
    }
}
