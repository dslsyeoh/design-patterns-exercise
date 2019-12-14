package com.dsl.design.pattern.singleton;

public class SingletonDemo
{
    public static void main(String[] args)
    {
        MySingletonClass mySingletonClass = new MySingletonClass();
        System.out.println(mySingletonClass.getInstance());
        System.out.println(mySingletonClass.getInstance());
    }
}
