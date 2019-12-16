/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.template;

public class TemplatePatternDemo
{
    public static void main(String[] args)
    {
        BasicDesktop basicDesktop = new BasicDesktop();
        System.out.println("============= BASIC DESKTOP =============");
        basicDesktop.build();
        System.out.println("============= BASIC DESKTOP =============");

        System.out.println("\n============= MEDIOCRE DESKTOP =============");
        MediocreDesktop mediocreDesktop = new MediocreDesktop();
        mediocreDesktop.build();
        System.out.println("============= MEDIOCRE DESKTOP =============");

        System.out.println("\n============= HIGH END DESKTOP =============");
        HighEndDesktop highEndDesktop = new HighEndDesktop();
        highEndDesktop.build();
        System.out.println("============= HIGH END DESKTOP =============");
    }
}
