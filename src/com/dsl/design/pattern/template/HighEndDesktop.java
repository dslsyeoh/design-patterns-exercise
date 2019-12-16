/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.template;

public class HighEndDesktop extends DesktopTemplate
{
    @Override
    public boolean addExtraRam()
    {
        return true;
    }

    @Override
    public boolean addGraphicCard()
    {
        return true;
    }

    @Override
    public boolean addSSD()
    {
        return true;
    }

    @Override
    public boolean addExtraCooler()
    {
        return true;
    }

    @Override
    public void addCasing()
    {
        System.out.println("Add Gaming Casing");
    }
}
