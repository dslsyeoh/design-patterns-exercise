/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.adapter;

public class HDMIToVGA implements Converter
{
    @Override
    public void convert()
    {
        System.out.println("Convert HDMI to VGA");
    }
}
