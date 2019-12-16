/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.template;

public abstract class DesktopTemplate
{
    public void addCasing()
    {
        System.out.println("Added Basic Casing");
    }

    public void addMother()
    {
        System.out.println("Added Motherboard");
    }

    public void addCPU()
    {
        System.out.println("Added CPU");
    }

    public void addHDD()
    {
        System.out.println("Added HDD");
    }

    public void addCooler()
    {
        System.out.println("Added Cooler");
    }

    public void addRam()
    {
        System.out.println("Added Ram");
    }

    public abstract boolean addExtraRam();
    public abstract boolean addGraphicCard();
    public abstract boolean addSSD();
    public abstract boolean addExtraCooler();

    public void build()
    {
        addCasing();
        addMother();
        addCPU();
        addHDD();
        addCooler();
        addRam();

        if(addExtraRam())
        {
            System.out.println("Added Extra RAM");
        }
        if(addGraphicCard())
        {
            System.out.println("Added Graphic Card");
        }
        else
        {
            System.out.println("No Graphic Card");
        }
        if (addSSD())
        {
            System.out.println("Added SSD");
        }
        if (addExtraCooler())
        {
            System.out.println("Added extra cooler");
        }
    }
}
