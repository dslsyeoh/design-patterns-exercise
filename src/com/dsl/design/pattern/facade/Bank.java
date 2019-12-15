/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.facade;

public class Bank implements IBank
{
    private Account account;

    public Bank(Account account)
    {
        this.account = account;
    }

    @Override
    public void withdraw(double amount)
    {
        AccountValidator accountValidator = new AccountValidator();
        boolean isAccountExists = accountValidator.validate(account.getAccountNumber());

        if(isAccountExists)
        {
            WithdrawalValidator withdrawalValidator = new WithdrawalValidator();
            int type = withdrawalValidator.validate(account.getSavings(), amount);
            switch (type)
            {
                case 0:
                    System.out.println(String.format("Account savings insufficient to withdrawal %.2f", amount));
                    break;
                case 1:
                    System.out.println("Account savings must at least remains 20 dollars after withdrawal");
                    break;
                case 2:
                    System.out.println("Withdraw success!");
                    break;
                default:
                    break;
            }
        }
        else
        {
            System.out.println("Account is not exists!");
        }
    }
}
