/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.template;

public class BasicDesktop extends DesktopTemplate
{
    @Override
    public boolean addExtraRam()
    {
        return false;
    }

    @Override
    public boolean addGraphicCard()
    {
        return false;
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
