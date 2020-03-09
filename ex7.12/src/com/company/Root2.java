package com.company;

public class Root2 {
    Component1 c1root;
    Component2 c2root;
    Component3 c3root;
    Root2()
    {
        System.out.println("Root()");
        c1root = new Component1();
        c2root = new Component2();
        c3root = new Component3();
    }
    void dispose()
    {
        c3root.dispose();
        c2root.dispose();
        c1root.dispose();
        System.out.println("Root2.dispose()");
    }
}
