/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.template;

public class MediocreDesktop extends DesktopTemplate
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
        return false;
    }

    @Override
    public boolean addExtraCooler()
    {
        return false;
    }
}