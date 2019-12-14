/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.strategy;

import java.util.Arrays;
import java.util.List;

public class StockImpl implements IStock
{
    @Override
    public List<String> list()
    {
        return Arrays.asList("Stock 1", "Stock 2", "Stock 3");
    }
}
