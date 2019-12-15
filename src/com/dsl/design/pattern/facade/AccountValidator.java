/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.facade;

import java.util.Arrays;
import java.util.List;

public class AccountValidator
{
    private List<String> validAccounts = Arrays.asList("123", "456");

    public boolean validate(String accountNumber)
    {
        return validAccounts.contains(accountNumber);
    }
}
