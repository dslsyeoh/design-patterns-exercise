/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.proxy;

public class ProxyPatternDemo
{
    public static void main(String[] args)
    {
        IConnection proxyConnection = new ProxyConnection("https://mywebsite.com");
        proxyConnection.connect();
    }
}
