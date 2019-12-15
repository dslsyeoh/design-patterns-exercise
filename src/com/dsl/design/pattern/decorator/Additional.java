/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.decorator;

public class Additional extends OperationDecorator
{
    private double x;
    private double y;

    public Additional(Operation operation)
    {
        this(1, 1, operation);
    }

    public Additional(double x, double y, Operation operation)
    {
        super(operation);
        this.x = x;
        this.y = y;
    }

    @Override
    public double compute()
    {
        return x + y + super.getOperation().compute();
    }
}
