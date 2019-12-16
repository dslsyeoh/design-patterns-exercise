/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.proxy;

public class RealConnection implements IConnection
{
    private String url;

    public RealConnection(String url)
    {
        System.out.println("Create real connection instance");
        this.url = url;
    }

    @Override
    public void connect()
    {
        System.out.println("Connect to " + url + " by real connection");
    }
}
