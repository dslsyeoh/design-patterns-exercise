/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.adapter;

public class Adaptor implements Converter
{
    private Converter converter;

    public Adaptor(Converter converter)
    {
        this.converter = converter;
    }

    @Override
    public void convert()
    {
        converter.convert();
    }
}
