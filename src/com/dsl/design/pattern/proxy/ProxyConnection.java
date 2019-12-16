/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.proxy;

import java.util.Objects;

public class ProxyConnection implements IConnection
{
    private String url;
    private RealConnection realConnection;

    public ProxyConnection(String url)
    {
        this.url = url;
    }

    @Override
    public void connect()
    {
        if(Objects.isNull(realConnection))
        {
            realConnection = new RealConnection(url);
        }
        realConnection.connect();
    }
}
