/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.adapter;

public class AdapterPatternDemo
{
    public static void main(String[] args)
    {
        Adaptor adaptor = new Adaptor(new HDMIToVGA());
        adaptor.convert();

        Adaptor adaptor2 = new Adaptor(new VGAToHDMI());
        adaptor2.convert();
    }
}
